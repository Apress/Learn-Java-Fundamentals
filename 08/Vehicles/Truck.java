class Truck extends Vehicle
{
   Truck(String make, String model, int year)
   {
      super(make, model, year);
   }

   @Override
   void drive()
   {
      System.out.println("Press gas pedal and steer.");
   }

   @Override
   public String toString()
   {
      return super.toString();
   }
}