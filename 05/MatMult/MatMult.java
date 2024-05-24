class MatMult
{
   public static void main(String[] args)
   {
      // Allocate two matrixes to be multiplied together.
      // m1 is a 2 row-by-2 column matrix.
      // m2 is a 2 row-by-1 column matrix.

      int[][] m1 = {{ 80, 60 }, { 59, 32 }};
      int[][] m2 = {{ 4 }, { 19 }};

      // Print out m1.

      for (int i = 0; i < m1.length; i++)
      {
         for (int j = 0; j < m1[0].length; j++)
            System.out.print(m1[i][j] + " ");
         System.out.println();
      }
      System.out.println();

      // Print out m2.

      for (int i = 0; i < m2.length; i++)
      {
         for (int j = 0; j < m2[0].length; j++)
            System.out.print(m2[i][j] + " ");
         System.out.println();
      }
      System.out.println();

      // Allocate result 2-by-1 matrix.

      int[][] m3 = new int[m1.length][m2[0].length];

      // Multiply m1 by m2 and add results to m3.

      for (int i = 0; i < m1.length; i++)
         for (int j = 0; j < m2[0].length; j++)
            for (int k = 0; k < m1[0].length; k++) // or k < m2.length
               m3[i][j] += m1[i][k] * m2[k][j];

      // Print out m3.

      for (int i = 0; i < m3.length; i++)
      {
         for (int j = 0; j < m3[0].length; j++)
            System.out.print(m3[i][j] + " ");
         System.out.println();
      }
   }
}