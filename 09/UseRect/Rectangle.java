abstract class Rectangle
{
   static class Float extends Rectangle
   {
      float x, y, w, h;

      Float() 
      {
      }

      Float(float x, float y, float w, float h) 
      {
         this.x = x;
         this.y = y;
         this.w = w;
         this.h = h;
      }

      @Override
      double getX() 
      {
         return x;
      }

      @Override
      double getY() 
      {
         return y;
      }

      @Override
      double getW() 
      {
         return w;
      }

      @Override
      double getH() 
      {
         return h;
      }
   }

   static class Double extends Rectangle
   {
      double x, y, w, h;

      Double() 
      {
      }

      Double(double x, double y, double w, double h) 
      {
         this.x = x;
         this.y = y;
         this.w = w;
         this.h = h;
      }

      @Override
      double getX() 
      {
         return x;
      }

      @Override
      double getY() 
      {
         return y;
      }

      @Override
      double getW() 
      {
         return w;
      }

      @Override
      double getH() 
      {
         return h;
      }
   }

   boolean contains(double x, double y) 
   {
      return (x >= getX() && x < getX() + getW() && y >= getY() && y < getY() + getH());
   }

   abstract double getX();

   abstract double getY();

   abstract double getW();

   abstract double getH();
}