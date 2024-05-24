interface Renderable
{
   public void render(int color);

   public static int rgb(int r, int g, int b)
   {
      return r << 16 | g << 8 | b;
   }
}