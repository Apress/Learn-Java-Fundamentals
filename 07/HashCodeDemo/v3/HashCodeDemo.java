class HashCodeDemo
{
   public static void main(String[] args)
   {
      HashMap map = new HashMap();
      Point p = new Point(10, 20); 
      map.put(p, "some point");
      System.out.println(map.get(p));
      System.out.println(map.get(new Point(10, 20)));
   }
}