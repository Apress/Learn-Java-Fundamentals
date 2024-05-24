public class ShowLineSeparator
{
   public static void main(String[] args)
   {
      String lineSeparator = System.lineSeparator();
      System.out.print("Line separator: ");
      for (int i = 0; i < lineSeparator.length(); i++)
         System.out.print((int) lineSeparator.charAt(i) + " ");
      System.out.println();
   }
}