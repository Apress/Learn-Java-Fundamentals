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

   @Override
   public String toString()
   {
      return super.toString() + "\n" + "Is extended cab: " + isExtendedCab;
   }
}