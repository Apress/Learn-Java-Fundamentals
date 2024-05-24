class Vehicles
{
   public static void main(String[] args)
   {
      Vehicle[] vehicles = 
         new Vehicle[] 
         { 
            new Truck("Ford", "F150", 2023),
            new Bicycle("Schwinn", "55 030788 120", 1988)
         };
      for (int i = 0; i < vehicles.length; i++)
      {
         System.out.println(vehicles[i]);
         vehicles[i].drive();
      }
   }
}