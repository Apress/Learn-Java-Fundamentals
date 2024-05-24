package demo;

import static demo.Openable.*;

public class Door
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