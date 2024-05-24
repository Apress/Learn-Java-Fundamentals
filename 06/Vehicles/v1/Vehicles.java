class Vehicles
{
   public static void main(String[] args)
   {
      Vehicle v = new Vehicle("Ford", "F150", 2023);

      System.out.println(v.make);
      System.out.println(v.model);
      System.out.println(v.year);

      v.setMake("Dodge");
      v.setModel("Durango");
      v.setYear(2023);

      System.out.println(v.getMake());
      System.out.println(v.getModel());
      System.out.println(v.getYear());
   }
}