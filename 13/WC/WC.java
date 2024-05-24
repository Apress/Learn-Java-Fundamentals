public class WC
{
   public static void main(String[] args) throws java.io.IOException
   {
      int ch, nwords = 0;
      boolean isWord = false;

      while ((ch = System.in.read()) != -1)
      {
         if (!isalpha(ch))
            isWord = false;
         else
         if (!isWord)
         {
            isWord = true;
            ++nwords;
         }
      }
      System.out.println("Number of words: " + nwords);
   }

   static boolean isalpha(int ch)
   {
      return ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
   }
}