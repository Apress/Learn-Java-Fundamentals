import java.io.*;

public class Copy
{
   public static void main(String[] args)
   {
      FileInputStream fis = null;
      FileOutputStream fos = null;
      try
      {
         fis = new FileInputStream(args[0]);
         fos = new FileOutputStream(args[1]);
         int c;
         while ((c = fis.read()) != -1)
            fos.write(c);
      }
      catch (FileNotFoundException fnfe)
      {
         System.out.println(fnfe.getMessage());
      }
      catch (IOException ioe)
      {
         System.out.println("I/O error: " + ioe.getMessage());
      }
      finally
      {
         if (fis != null)
            try
            {
               fis.close();
            }
            catch (IOException ioe)
            {
               // ignore exception
            }
         if (fos != null)
            try
            {
               fos.close();
            }
            catch (IOException ioe)
            {
               // ignore exception
            }
      }
   }
}