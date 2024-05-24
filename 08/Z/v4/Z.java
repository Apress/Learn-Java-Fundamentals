interface X
{
   int SOME_CONSTANT = 2;
   void some_method();
}

interface Y
{
   int SOME_CONSTANT = 3;
   int some_method(int x);
}

interface Z extends X, Y
{
   int SOME_CONSTANT2 = SOME_CONSTANT;
}