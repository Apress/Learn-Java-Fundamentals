class Stack
{
   private int[] stack;
   private int top;

   Stack(int size)
   {
      stack = new int[size];
      top = -1;
   }

   boolean isEmpty()
   {
      return top == -1;
   }

   void push(int item)
   {
      if (top == stack.length)
      {
         System.out.println("stack is full");
         return;
      }
      stack[++top] = item;
   }

   int pop()
   {
      if (top == -1)
      {
         System.out.println("stack is empty");
         return -1;
      }
      return stack[top--];
   }
}