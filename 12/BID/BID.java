// BigInteger Demo

import java.math.BigInteger;

class BID
{
   public static void main(String[] args)
   {
      BigInteger bi1 = new BigInteger("100");
      BigInteger bi2 = new BigInteger("25");
      System.out.println("bi1 = " + bi1);
      System.out.println("bi2 = " + bi2);
      System.out.println("bi1 + bi2: " + bi1.add(bi2));
      System.out.println("bi1 - bi2: " + bi1.subtract(bi2));
      System.out.println("bi1 * bi2: " + bi1.multiply(bi2));
      System.out.println("bi1 / bi2: " + bi1.divide(bi2));
   }
}