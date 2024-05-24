// BigDecimal Demo

import java.math.BigDecimal;
import java.math.RoundingMode;

class BDD
{
   public static void main(String[] args)
   {
      BigDecimal purchaseAmount = new BigDecimal("586.32");
      BigDecimal pstRate = new BigDecimal("0.06");
      System.out.println("Purchase amount: " + purchaseAmount);
      System.out.println("PST rate: " + pstRate);

      // Calculate provincial sales tax on purchase.

      BigDecimal pst = purchaseAmount.multiply(pstRate);
      System.out.println("PST: " + pst);
      pst = pst.setScale(2, RoundingMode.HALF_UP);
      System.out.println("PST: " + pst);
   }
}