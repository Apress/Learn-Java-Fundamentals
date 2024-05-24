class HashMap 
{
   private static final int SIZE = 16;
   private Node[] buckets;

   public HashMap() 
   {
      buckets = new Node[SIZE];
   }

   public void put(Object key, Object value) 
   {
      int index = Math.abs(key.hashCode()) % SIZE;
      Node node = buckets[index];

      while (node != null) 
      {
         if (node.key.equals(key)) 
         {
            node.value = value;
            return;
         }
         node = node.next;
      }

      Node newNode = new Node(key, value);
      newNode.next = buckets[index];
      buckets[index] = newNode;
   }

   public Object get(Object key) 
   {
      int index = Math.abs(key.hashCode()) % SIZE;
      Node node = buckets[index];

      while (node != null) 
      {
         if (node.key.equals(key))
            return node.value;
         node = node.next;
      }

      return null;
   }

   public void remove(Object key) 
   {
      int hashCode = key.hashCode();
      int index = hashCode % SIZE;

      Node node = buckets[index];
      Node prev = null;

      while (node != null) 
      {
         if (node.key.equals(key)) 
         {
            if (prev != null)
               prev.next = node.next;
            else
               buckets[index] = node.next;
            return;
         }
         prev = node;
         node = node.next;
      }
   }
}