public class UseRenderable
{
   public static void main(String[] args)
   {
      Circle circle = new Circle(20, 30, 14);
      circle.render(Renderable.rgb(0x80, 0x60, 0x40));
   }
}