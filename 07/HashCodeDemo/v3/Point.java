class Point
{
   int x, y;

   Point(int x, int y)
   {
      this.x = x; this.y = y;
   }

   int getX() 
   { 
      return x; 
   } 

   int getY() 
   { 
      return y; 
   } 

   @Override
   public boolean equals(Object o)
   {
      if (!(o instanceof Point)) 
         return false;
      Point p = (Point) o;
      return p.x == x && p.y == y;
   }

   @Override
   public int hashCode()
   {
      int result = 17; // A prime number to start with
      result = 31 * result + x; // Combine with x
      result = 31 * result + y; // Combine with y
      return result;      
   }
}