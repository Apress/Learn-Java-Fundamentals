class RagArray
{
   public static void main(String[] args)
   {
      int[][] table1 = { { 10, 15 }, { 20, 25, 30 } };
      int[][] table2 = new int[2][];
      int[][] table3 = new int[][] { { 10, 15 }, { 20, 25, 30 } };

      table2[0] = new int[2];
      table2[0][0] = 10;
      table2[0][1] = 15;
      table2[1] = new int[3];
      table2[1][0] = 20;
      table2[1][1] = 25;
      table2[1][2] = 30;

      for (int i = 0; i < table1.length; i++)
      {
         for (int j = 0; j < table1[i].length; j++)
            System.out.print(table1[i][j] + " ");
         System.out.println();
      }
      System.out.println();

      for (int i = 0; i < table2.length; i++)
      {
         for (int j = 0; j < table2[i].length; j++)
            System.out.print(table2[i][j] + " ");
         System.out.println();
      }
      System.out.println();

      for (int i = 0; i < table3.length; i++)
      {
         for (int j = 0; j < table3[i].length; j++)
            System.out.print(table3[i][j] + " ");
         System.out.println();
      }
   }
}