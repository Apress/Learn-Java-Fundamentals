class Truck extends Vehicle
{
   private boolean isExtendedCab;

   Truck(String make, String model, int year, boolean isExtendedCab)
   {
      super(make, model, year);
      this.isExtendedCab = isExtendedCab;
   }

   boolean isExtendedCab()
   {
      return isExtendedCab;
   }

   void info()
   {
      super.info();
      System.out.println("Is extended cab: " + isExtendedCab);
   }
}