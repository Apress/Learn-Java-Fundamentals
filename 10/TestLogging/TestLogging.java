import logging.Logger;
import logging.LoggerFactory;

class TestLogging
{
   public static void main(String[] args)
   {
      Logger logger = LoggerFactory.newLogger(LoggerFactory.CONSOLE); 
      if (logger.connect())
      {
         logger.log("test message #1"); 
         logger.disconnect();
      }
      else
         System.out.println("cannot connect to console-based logger");

      logger = LoggerFactory.newLogger(LoggerFactory.FILE, "messages.txt");
      if (logger.connect())
      {
         logger.log("test message #2"); 
         logger.disconnect();
      }
      else
         System.out.println("cannot connect to file-based logger");

      logger = LoggerFactory.newLogger(LoggerFactory.FILE);
      if (logger.connect())
      {
         logger.log("test message #3"); 
         logger.disconnect();
      }
      else
         System.out.println("cannot connect to file-based logger");
   }
}