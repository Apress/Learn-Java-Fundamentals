public class SBD
{
   public static void main(String[] args)
   {
      StringBuffer sb = new StringBuffer();

      System.out.println("Initial capacity: " + sb.capacity());
      System.out.println("Initial length: " + sb.length());

      System.out.println("Appending 'The quick brown fox jumped over " +
                         "the lazy dog.'");
      sb.append("The quick brown fox jumped over the lazy dog.");
      System.out.println("Capacity: " + sb.capacity());
      System.out.println("Length: " + sb.length());
      System.out.println("Current contents of string buffer (between [ and ]):");
      System.out.print("[");
      for (int i = 0; i < sb.length(); i++)
         System.out.print(sb.charAt(i));
      System.out.println("]");

      System.out.println("Deleting characters from 3 through 8");
      sb.delete(3, 9);
      printSB(sb);

      System.out.println("Inserting 'quick ' at position 4");
      sb.insert(4, "quick ");
      printSB(sb);

      System.out.println("Index of 'dog': " + sb.indexOf("dog"));
      System.out.println("Index of 'dig': " + sb.indexOf("dig"));
      System.out.println("Last index of 'he': " + sb.lastIndexOf("he"));
      System.out.println("Last index of 'fix': " + sb.lastIndexOf("fix"));
      System.out.println("Reversing string buffer");
      sb.reverse();
      printSB(sb);

      System.out.println("Reversing string buffer");
      sb.reverse();
      printSB(sb);

      System.out.println("Changing length to 48");
      sb.setLength(48);
      printCapLenCon(sb);

      System.out.println("Extracting substring from 5 through 9");
      System.out.println("[" + sb.substring(5, 10) + "]");

      System.out.println("Trimming string buffer");
      sb.trimToSize();
      printCapLenCon(sb);

      System.out.println("Changing length to 15");
      sb.setLength(15);
      printCapLenCon(sb);
   }

   static void printCapLenCon(StringBuffer sb)
   {
      System.out.println("Capacity: " + sb.capacity());
      System.out.println("Length: " + sb.length());
      printSB(sb);
   }

   static void printSB(StringBuffer sb)
   {
      System.out.println("Current contents of string buffer:");
      System.out.print("[");
      System.out.print(sb);
      System.out.println("]");
   }
}