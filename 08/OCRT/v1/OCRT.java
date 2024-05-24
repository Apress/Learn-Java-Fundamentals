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
   // ChildClass overrides ParentClass's createReturnType() method.
   // Notice that the return type of ChildClass's createReturnType()
   // method has changed from ParentReturnType to ChildReturnType.
   // Without covariant return types, the return type would have to 
   // be ParentReturnType.

   @Override
   ChildReturnType createReturnType()
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

      // The following statement instantiates ChildClass and invokes its
      // createReturnType() method. The resulting ChildClass reference 
      // that createReturnType() returns is assigned to crt. Without 
      // covariant return types, you would have to explicitly cast the 
      // new operator's returned object to ChildReturnType via the 
      // (ChildClass) cast operator.

      ChildReturnType crt = new ChildClass().createReturnType();
      System.out.println(crt);
   }
}