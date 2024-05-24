class LinkedCollection implements Collection
{
   private Node top, last;
   private int length;

   LinkedCollection()
   {
      top = null;
      last = null;
      length = 0;
   }

   @Override
   public void add(String item)
   {
      Node node = new Node();
      node.item = item;
      node.next = null;
      if (last != null)
         last.next = node;
      last = node;
      if (top == null)
         top = node;
      length++;
   }

   @Override
   public boolean contains(String item)
   {
      Node node = top;
      for (int i = 0; i < length; i++)
         if (item.equals(node.item))
            return true;
         else
            node = node.next;
      return false;
   }

   @Override
   public int length()
   {
      return length;
   }
}

class Node
{
   String item;
   Node next;
}