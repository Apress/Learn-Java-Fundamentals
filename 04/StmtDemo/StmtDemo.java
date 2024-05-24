class StmtDemo
{
   public static void main(String[] args)
   {
      if (args.length != 1)
      {
         System.out.println("usage: java StmtDemo ([-h] | [-v] | " + 
                            "[positive integer count])");
         return;
      }

      switch (args[0])
      {
         case "-H":
         case "-h": System.out.println("help");
                    return;

         case "-V":
         case "-v": System.out.println("version 1.0");
                    return;

         default  : int count = 0;
                    for (int i = 0; i < args[0].length(); i++)
                    {
                       char digit = args[0].charAt(i);
                       if (digit < '0' || digit > '9')
                       {
                          System.out.println("invalid character detected: " + 
                                             digit);
                          return;
                       }
                       count *= 10;
                       count += digit - '0';
                    }
                    for (int i = 0; i < count; i++)
                       System.out.print("*");
                    System.out.println();
      }
   }
}