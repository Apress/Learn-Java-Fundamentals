public class TimeDemo
{
   public static void main(String[] args)
   {
      System.out.println("Number of milliseconds since midnight, January 1, " +
                         "1970 UTC: " + 
                         System.currentTimeMillis());
      System.out.println("Number of milliseconds since midnight, January 1, " +
                         "1970 UTC in human-readable format: " + 
                         new java.util.Date(System.currentTimeMillis()));
      System.out.println("Number of nanoseconds since some arbitrary origin " +
                         "time: " + System.nanoTime());

      // Calculate how much time (in nanoseconds) it takes to calculate and 
      // output all of a circle's sine values in increments of 0.1 radians 100
      // times:

      long start = System.nanoTime();
      for (int i = 0; i < 100; i++)
         for (double angle = 0; angle < Math.PI * 2; angle += 0.1)
            System.out.println(Math.sin(angle));
      long end = System.nanoTime();
      System.out.println("Elapsed time (in nanoseconds): " + (end - start + 1));
      System.out.println("Elapsed time (in seconds): " + 
                         ((end - start + 1) / (1000 * 1000 * 1000)));
   }
}