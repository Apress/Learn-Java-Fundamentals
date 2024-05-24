class VarargsDemo
{
   public static void main(String[] args)
   {
      System.out.println(min(-8, 55, 0, -12, 14));   
      System.out.println(min(new int[] {-8, 55, 0, -12, 14}));   
      System.out.println(min2(new int[] {-8, 55, 0, -12, 14}));   
//      System.out.println(min2(-8, 55, 0, -12, 14));   
   }

   static int min(int... values)
   {
      int smallest = 0;
      for (int i = 0; i < values.length; i++)
         if (values[i] < smallest)
            smallest = values[i];
      return smallest;
   }

   static int min2(int[] values)
   {
      int smallest = 0;
      for (int i = 0; i < values.length; i++)
         if (values[i] < smallest)
            smallest = values[i];
      return smallest;
   }
}