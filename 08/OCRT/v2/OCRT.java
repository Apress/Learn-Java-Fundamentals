// Observing Covariant Return Types

class ParentReturnType
{
   @Override
   public String toString()
   {
      return "parent class return type";
   }
}

class ChildReturnType extends ParentReturnType
{
   @Override
   public String toString()
   {
      return "child class return type";
   }
}

class ParentClass
{
   ParentReturnType createReturnType()
   {
      return new ParentReturnType();
   }
}

class ChildClass extends ParentClass
{
   @Override
   ParentReturnType createReturnType()
   {
      return new ChildReturnType();
   }
}

class OCRT
{
   public static void main(String[] args)
   {
      ParentReturnType prt = new ParentClass().createReturnType();
      System.out.println(prt);
      ChildReturnType crt = 
         (ChildReturnType) new ChildClass().createReturnType();
      System.out.println(crt);
   }
}