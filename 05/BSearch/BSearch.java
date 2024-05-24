class BSearch
{
   public static void main(String[] args)
   {
      int[] nums = { 4, 5, 8, 11, 19, 33, 42, 51, 67, 69, 83, 84, 86, 91, 93, 98 };

      int high = nums.length - 1, low = 0, mid;
      int srchint = 83;
      while (low <= high)
      {
         mid = (low + high) / 2;
         if (srchint > nums[mid])
            low = mid + 1;
         else
         if (srchint < nums[mid])
            high = mid - 1;
         else
         {
            System.out.println("Found " + srchint);
            break;
         }
      }
      if (low > high)
         System.out.println("Could not find " + srchint);

      high = nums.length - 1;
      low = 0;
      srchint = 27;
      while (low <= high)
      {
         mid = (low + high) / 2;
         if (srchint > nums[mid])
            low = mid + 1;
         else
         if (srchint < nums[mid])
            high = mid - 1;
         else
         {
            System.out.println("Found " + srchint);
            break;
         }
      }
      System.out.println("Could not find " + srchint);
   }
}