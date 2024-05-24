class Vehicle
{
   private String make;
   private String model;
   private int year;

   Vehicle(String make, String model)
   {
      setMake(make).setModel(model).setYear(-1);
   }

   Vehicle(String make, String model, int year)
   {
      setMake(make).setModel(model).setYear(year);
   }

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

   Vehicle setMake(String make)
   {
      this.make = make;
      return this;
   }

   Vehicle setModel(String model)
   {
      this.model = model;
      return this;
   }

   Vehicle setYear(int year)
   {
      this.year = year;
      return this;
   }
}