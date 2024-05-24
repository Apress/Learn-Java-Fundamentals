class EnclosingClass
{
   public final static double PI = 3.14159;

   public static double area(double radius)
   {
      return PI * radius * radius;
   }

   private String msg;

   private void printMessage()
   {
      System.out.println(msg);
   }

   class EnclosedClass
   {
      void accessMembersOfEnclosingClass()
      {
         msg = "called from EnclosedClass's accessMembersOfEnclosingClass() " +
               "method";
         printMessage();
         System.out.println("PI = " + PI);
         System.out.println("area(10.0) = " + area(10.0));
      }
   }
}