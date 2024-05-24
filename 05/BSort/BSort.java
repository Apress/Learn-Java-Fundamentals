class BSort
{
   public static void main(String[] args)
   {
      int[] grades = { 86, 92, 68, 75, 79, 81 };

      for (int pass = 0; pass < grades.length - 1; pass++)
         for (int i = grades.length - 1; i > pass; i--)
            if (grades[i] < grades[pass])
            {
               // Swap grades[i] with grades[pass].
               int temp = grades[i];
               grades[i] = grades[pass];
               grades[pass] = temp;
            }

      for (int i = 0; i < grades.length; i++)
         System.out.println(grades[i]);
   }
}