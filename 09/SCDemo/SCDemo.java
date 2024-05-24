class SCDemo
{
   public static void main(String[] args)
   {
      EnclosingClass.EnclosedClass.enclosedMethod1();
      EnclosingClass.EnclosedClass ec = new EnclosingClass.EnclosedClass();
      ec.enclosedMethod2();
   }
}