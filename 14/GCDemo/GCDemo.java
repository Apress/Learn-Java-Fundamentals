public class GCDemo
{
   public final static int MAXMB = 50;
   public final static int MAXTRIES = 1000;

   public static void main(String[] args)
   {
      class LargeObject
      {
         private byte[] memory = new byte[MAXMB * 1024 *1024]; // convert 50 
                                                               // megabytes to 
                                                               // bytes

         @Override
         public void finalize()
         {
            System.out.println("Large object has been finalized.");
         }
      }

      LargeObject lo = new LargeObject();

      // Prove that there is no garbage collection of lo-referenced LargeObject
      // at this point.

      System.out.println("Performing garbage collection before assigning " +
                         "null to lo.");

      for (int i = 0; i < MAXTRIES; i++)
         System.gc();
 
      // Assign null to lo to disconnect object from variable and make it 
      // available for garbage collection.

      System.out.println("Assigning null to lo.");

      lo = null;

      // Prove that there is garbage collection of lo-referenced LargeObject
      // at this point. (You might have to assign a larger value to MAXTRIES
      // to see this proof.)

      System.out.println("Performing garbage collection after assigning " +
                         "null to lo.");

      for (int i = 0; i < MAXTRIES; i++)
         System.gc();
   }
}