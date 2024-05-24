class ExprDemo
{
   public static void main(String[] args)
   {
      System.out.println("\"abc\" instanceof String: " + 
                         ("abc" instanceof String));
      System.out.println("4 << 1: " + (4 << 1));
      System.out.println("-4 << 1: " + (-4 << 1));
      System.out.println("1 << 31: " + (1 << 31));
      System.out.println("1 << 32: " + (1 << 32));
      System.out.println("-1 << 31: " + (-1 << 31));
      System.out.println("-1 << 32: " + (-1 << 32));
      int x = 3;
      System.out.println("x++: " + x++);
      System.out.println("x: " + x);
      System.out.println("5 / 0: " + (5 / 0));
   }
}