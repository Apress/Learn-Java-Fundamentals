class Circle implements Renderable
{
   private int x, y, r;

   Circle(int x, int y, int r)
   {
      this.x = x;
      this.y = y;
      this.r = r;
   }

   @Override
   public void render(int color)
   {
      System.out.println("Rendering circle(" + x + ", " + y + ", " + r + 
                         ") in color " + color);
   }
}