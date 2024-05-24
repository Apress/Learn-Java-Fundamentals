class AddressBook
{
   private Address[] addressList;
   private int index = 0;

   AddressBook(int size)
   {
      addressList = new Address[size];
   }

   Iterator iterator()
   {
      class LocalIterator implements Iterator
      {
         int index = 0;

         @Override
         public boolean hasMoreElements()
         {
            return index < addressList.length;
         }

         @Override
         public Object nextElement()
         {
            return addressList[index++];
         }
      }
      return new LocalIterator();
   }

   void add(Address address)
   {
      addressList[index++] = address;
   }
}