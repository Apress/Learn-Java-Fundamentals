class Sort
{
   public static void main(String[] args)
   {
      System.out.println("Sort");
      System.out.println("----");
      System.out.println();

      int[] grades = new int[] { 96, 54, 71, 89, 63, 92 };
      outputArray("Unsorted array:", grades);
      sort(grades, new Comparer() 
                   { 
                      @Override
                      public int compare(int x, int y) 
                      { 
                         return x - y;
                      }
                  });
      outputArray("Sorted array after ascending sort:", grades);
      System.out.println();

      int[] grades2 = new int[] { 79, 56, 100, 88 };
      outputArray("Unsorted array:", grades2);
      sort(grades2, new Comparer() 
                   { 
                      @Override
                      public int compare(int x, int y) 
                      { 
                         return y - x;
                      }
                  });
      outputArray("Sorted array after descending sort:", grades2);
   }

   static void outputArray(String msg, int[] x)
   {
      System.out.println(msg);
      System.out.println();
      for (int i = 0; i < x.length; i++)
         System.out.print(x[i] + " ");
      System.out.println();
      System.out.println();
   }

   static void sort(int[] x, Comparer c)
   {
      for (int pass = 0; pass < x.length - 1; pass++)
      {
         int min = pass;
         for (int i = pass + 1; i < x.length; i++)
            if (c.compare(x[i], x[min]) < 0)
               min = i;
         if (min != pass)
         {
            int temp = x[min];
            x[min] = x[pass];
            x[pass] = temp;
         }
      }
   }
}