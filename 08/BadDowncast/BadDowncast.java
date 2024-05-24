class Vehicle
{
}

class Truck extends Vehicle
{
   private boolean isExtendedCab;

   boolean isExtendedCab()
   {
      return isExtendedCab;
   }
}
public class BadDowncast
{
   public static void main(String[] args)
   {
      Vehicle v = new Vehicle();
      Truck t = (Truck) v;
      System.out.println(t.isExtendedCab());
   }
}