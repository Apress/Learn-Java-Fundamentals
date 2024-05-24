class UseRect
{
   public static void main(String[] args)
   {
      System.out.println("Rectangle.Float Demo");
      System.out.println();

      Rectangle r = new Rectangle.Float(10.0f, 20.0f, 30f, 40f);
      System.out.println(r.getX());
      System.out.println(r.getY());
      System.out.println(r.getW());
      System.out.println(r.getH());
      System.out.println("contains(40.0, 45.0): " + r.contains(35.0, 40.0));
      System.out.println("contains(80.0, 45.0): " + r.contains(80.0, 40.0));
      System.out.println();

      System.out.println("Rectangle.Double Demo");
      System.out.println();
      r = new Rectangle.Double(15.0, 25.0, 35, 45);
      System.out.println(r.getX());
      System.out.println(r.getY());
      System.out.println(r.getW());
      System.out.println(r.getH());
      System.out.println("contains(40.0, 45.0): " + r.contains(40.0, 45.0));
      System.out.println("contains(80.0, 45.0): " + r.contains(80.0, 45.0));
   }
}