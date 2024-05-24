public class SD
{
   public static void main(String[] args)
   {
      String s = "The quick brown fox jumped over the lazy dog.";
      for (int i = 0; i < s.length(); i++)
         System.out.print(s.charAt(i));
      System.out.println();
      System.out.println("Ends with 'dog.': " + s.endsWith("dog."));
      System.out.println("Ends with 'dog': " + s.endsWith("dog"));
      System.out.println("Starts with 'The': " + s.startsWith("The"));
      System.out.println("Starts with 'They': " + s.startsWith("They"));
      System.out.println("Index of 'he': " + s.indexOf("he"));
      System.out.println("Index of 'fix': " + s.indexOf("fix"));
      System.out.println("Last index of 'he': " + s.lastIndexOf("he"));
      System.out.println("Last index of 'fix': " + s.lastIndexOf("fix"));
      System.out.println("Replace spaces with dashes: " + s.replace(' ', '-'));
      String rep = "a";
      System.out.println("Replace all occurrences of 'the' (regardless of " +
                         "case) with " +
                         "'" + rep + "'" +
                         " (first '" + rep + "'" +
                         " is capitalized): " +
                         s.replaceAll("(?i)the", rep)
                          .replaceFirst("^[a-z]", rep.toUpperCase()));
      System.out.println("Lowercase: " + s.toLowerCase());
      System.out.println("Uppercase: " + s.toUpperCase());
   }
}