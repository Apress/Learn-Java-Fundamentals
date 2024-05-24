class ArrayCollection implements Collection
{
   private String[] items;
   private int length;

   ArrayCollection(int size)
   {
      items = new String[size];
      length = 0;
   }

   @Override
   public void add(String item)
   {
      if (length == items.length)
         resize(items.length * 2);
      items[length++] = item;
   }

   @Override
   public boolean contains(String item)
   {
      for (int i = 0; i < length; i++)
         if (item.equals(items[i]))
            return true;
      return false;
   }

   @Override
   public int length()
   {
      return length;
   }

   void resize(int newSize)
   {
      String[] items2 = new String[newSize];
      for (int i = 0; i < length; i++) // copy items to items2
         items2[i] = items[i];
      items = items2;
   }
}