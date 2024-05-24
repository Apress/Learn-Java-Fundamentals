class Bicycle extends Vehicle
{
   Bicycle(String make, String model, int year)
   {
      super(make, model, year);
   }

   @Override
   void drive()
   {
      System.out.println("Pump the pedals and steer.");
   }

   @Override
   public String toString()
   {
      return super.toString();
   }
}