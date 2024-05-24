class EnclosingClass
{
   void m(final int i)
   {
      final int j = i * 10;

      class LClass
      {
         int m = i;
         int n = j;
      }

      LClass lc = new LClass();
      System.out.println(lc.m);
      System.out.println(lc.n);
   }
}