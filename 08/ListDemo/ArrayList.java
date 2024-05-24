class ArrayList implements List
{
   private String[] items;
   private int length;

   ArrayList(int size)
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

   @Override
   public String get(int index)
   {
      if (index < 0 || index >= length)
         return null;
      return items[index];
   }

   void resize(int newSize)
   {
      String[] items2 = new String[newSize];
      for (int i = 0; i < length; i++) // copy items to items2
         items2[i] = items[i];
      items = items2;
   }
}