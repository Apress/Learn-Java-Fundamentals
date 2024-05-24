public class Circle
{
   public static void main(String[] args)
   {
      if (args.length != 1)
      {
         System.out.println("usage: java Circle diameter");
         return;
      }

      double diameter = Double.parseDouble(args[0]);
      System.out.println("Diameter: " + diameter);
      System.out.println("Circle area: " + Math.PI * diameter);
      double radius = diameter / 2;
      System.out.println("Circle circumference: " + 
                         Math.PI * radius * radius);
   }
}