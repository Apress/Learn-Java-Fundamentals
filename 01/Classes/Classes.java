class A
{
   static void a()
   {
       System.out.println("a() called");
   }
}

class B
{
   static void b()
   {
       System.out.println("b() called");
   }
}

class C
{
   public static void main(String[] args)
   {
      A.a();
      B.b();
   }
}