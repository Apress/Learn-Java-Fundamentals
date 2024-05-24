import java.util.Properties;

public class PropertiesDemo
{
   public static void main(String[] args)
   {
      // Demonstrating setProperty(), getProperty(), and clearProperty().

      System.setProperty("temp.location", "C:\\temp");
      showProperty("Temporary Location before clear", "temp.location");
      System.clearProperty("temp.location");
      showProperty("Temporary Location after clear", "temp.location");

      // Demonstrating getProperties() and Properties.

      Properties properties = System.getProperties();
      showProperty("Java Version", properties.getProperty("java.version"));
      showProperty("OS Name", properties.getProperty("os.name"));
      showProperty("User's Home Directory", properties.getProperty("user.home"));
      System.out.println();
      properties.list(System.out);

      // More demonstrations of getProperty().

      showProperty("Java Version", "java.version");
      showProperty("OS Name", "os.name");
      showProperty("Java Class Path", "java.class.path");
      showProperty("Line Separator", "line.separator");
      showProperty("User's Account Name", "user.name");
      showProperty("User's Home Directory", "user.home");

      // Demonstrating setProperty().

      System.setProperty("someprop", "somevalue");
      showProperty("Some Property", "someprop");

      // Demonstrating setProperties().

      Properties newProperties = new Properties();
      newProperties.setProperty("someprop1", "somevalue1");
      newProperties.setProperty("someprop2", "somevalue2");
      System.setProperties(newProperties);
      showProperty("Some Property 1", "someprop1");
      showProperty("Some Property 2", "someprop2");
   }

   static void showProperty(String msg, String propertyName)
   {
      System.out.printf("%s: %s%n", msg, System.getProperty(propertyName));
   }
}