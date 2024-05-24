public class ArrayResize
{
   public static void main(String[] args)
   {
      int[] src = new int[] { 20, 30, 50 };
      int[] dest = new int[10];
      for (int i = 0; i < src.length; i++)
         dest[i] = src[i];
      dump(dest);
      int[] dest2 = new int[10];
      System.arraycopy(src, 0, dest2, 0, src.length);
      dump(dest2);
   }

   static void dump(int[] array)
   {
      for (int i = 0; i < array.length; i++)
         System.out.print(array[i] + " ");
      System.out.println();
   }
}