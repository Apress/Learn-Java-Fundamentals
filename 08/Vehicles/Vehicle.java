abstract class Vehicle
{
   private String make, model;
   private int year;

   Vehicle(String make, String model, int year)
   {
      this.make = make;
      this.model = model;
      this.year = year;
   }

   abstract void drive();

   String getMake()
   {
      return make;
   }

   String getModel()
   {
      return model;
   }

   int getYear()
   {
      return year;
   }

   @Override
   public String toString()
   {
      return "Make: " + make + ", Model: " + model + ", Year: " + year;
   }
}