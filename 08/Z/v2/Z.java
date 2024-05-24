interface X
{
   int SOME_CONSTANT = 2;

   void some_method();
}

interface Y
{
   int SOME_CONSTANT = 3;

   int some_method(int i);
}

class Z implements X, Y
{
   int i = SOME_CONSTANT;

   @Override
   public void some_method()
   {
   }

   @Override
   public int some_method(int i)
   {
      return i;
   }
}