package demo;

public class Door implements Openable
{
   private boolean state = CLOSED;

   public void status()
   {
      System.out.println("door is " + ((state == CLOSED) ? "CLOSED" : "OPEN"));
   }

   public void open()
   {
      state = OPEN;
   }

   public void close()
   {
      state = CLOSED;
   }
}