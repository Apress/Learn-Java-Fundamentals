public class FormattedOutputDemo
{
   public static void main(String[] args)
   {
      int i = 10;

      System.out.printf("i = [%d]%n", i);
      System.out.printf("i = [%5d]%n", i);
      System.out.printf("i = [%05d]%n", i);
      System.out.printf("i = [%-5d]%n", i);

      String s = "hello, world";

      System.out.printf("s = [%s]%n", s); 
      System.out.printf("s = [%30s]%n", s); 
   }
}