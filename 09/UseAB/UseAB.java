class UseAB
{
   public static void main(String[] args)
   {
      AddressBook addressBook = new AddressBook(3);
      addressBook.add(new Address("100 Elm Street", "City #1"));
      addressBook.add(new Address("200 Bay Street", "City #2"));
      addressBook.add(new Address("300 Oak Street", "City #3"));
      Iterator iter = addressBook.iterator();
      while (iter.hasMoreElements())
         System.out.println(iter.nextElement());
   }
}