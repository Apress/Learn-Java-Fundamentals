class ShadowDemo
{
   String name = "Java";

   class EnclosedClass
   {
      String name = "More Java";

      void outputName(String name) 
      {
         System.out.println("name = " + name);
         System.out.println("this.name = " + this.name);
         System.out.println("ShadowDemo.this.name = " + ShadowDemo.this.name);
      }
   }

   public static void main(String[] args)
   {
      ShadowDemo sd = new ShadowDemo();
      ShadowDemo.EnclosedClass ec = sd.new EnclosedClass();
      ec.outputName("Even more Java");
   }
}