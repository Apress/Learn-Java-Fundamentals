class Counter
{
   final int Count1 = 10; // instance final field that will remain the same for each
                          // constructed object
   final int Count2;      // blank final that is initialized in constructor

   Counter(int initialCount) // each blank final can receive a different value that
   {                         // remains unchanged throughout the life of the object
      Count2 = initialCount;
   }
}