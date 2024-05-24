public class Graph
{
   final static int ROWS = 27; // Must be odd
   final static int COLS = 50;

   public static void main(String[] args)
   {
      char[][] screen = new char[ROWS][COLS];
      double scaleX = COLS / 360.0;

      // Draw sine and cosine waves in buffer.

      for (int degree = 0; degree < 360; degree++)
      {
         int row = ROWS / 2 +
         (int) Math.round(ROWS / 2 * Math.sin(Math.toRadians(degree)));
         int col = (int) (degree * scaleX);
         screen[row][col] = 'S';
         row = ROWS / 2 +
         (int) Math.round(ROWS / 2 * Math.cos(Math.toRadians(degree)));
         screen[row][col] = (screen[row][col] == 'S') ? '*' : 'C';
      }

      // Draw axes in buffer.

      for (int i = 0; i < COLS; i++)
         screen[ROWS / 2][i] = '-';
      for (int i = 0; i < ROWS; i++)
         screen[i][0] = '|';

      // Draw buffer on screen.

      for (int row = ROWS - 1; row >= 0; row--)
      {
         for (int col = 0; col < COLS; col++)
            System.out.print(screen[row][col]);
         System.out.println();
      }
   }
}