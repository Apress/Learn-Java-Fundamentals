class EnclosingClass
{
   private static String msg1;
   private static void enclosingMethod1()
   {
      System.out.println(msg1);
   }

   private String msg2;
   private void enclosingMethod2()
   {
      System.out.println(msg2);
   }

   static class EnclosedClass
   {
      static void enclosedMethod1()
      {
         msg1 = "called from EnclosedClass's enclosingMethod1() method";
         enclosingMethod1();
      }

      void enclosedMethod2()
      {
         System.out.println("unable to access msg2 or call enclosingMethod2()");
         // msg2 = "called from EnclosedClass's enclosingMethod2() method";
         // enclosingMethod2();
      }
   }
}