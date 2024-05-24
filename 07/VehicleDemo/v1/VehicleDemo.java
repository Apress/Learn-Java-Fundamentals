class VehicleDemo
{
   public static void main(String[] args)
   {
      Truck truck = new Truck("Ford", "F150", 2023, true);
      System.out.println("Make = " + truck.getMake());
      System.out.println("Model = " + truck.getModel());
      System.out.println("Year = " + truck.getYear());
      System.out.println("Is extended cab = " + truck.isExtendedCab());
      truck.info();
   }
}