public class TR
{
   public static void main(String[] args)
   {
      if (args.length == 0)
      {
         System.out.println("usage: java TR sequence of words");
         return;
      }

      StringBuffer sb = new StringBuffer();
      for (int i = 0 ; i < args.length; i++)
         sb.append(args[i] + " ");

      System.out.println("Text: " + sb.toString());
      System.out.println("Reversed text: " + sb.reverse().toString());
   }
}