class Employee
{
   private String name;
   private int age;

   Employee(String name, int age)
   {
      this.name = name;
      this.age = age;
   }

   String getName()
   {
      return name;
   }

   int getAge()
   {
      return age;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (!(obj instanceof Employee))
         return false;
      Employee emp = (Employee) obj;
      return emp.getName().equals(name) && emp.getAge() == age;
   }
}

class EqualsDemo
{
   public static void main(String[] args)
   {
      Employee john = new Employee("John Doe", 29);
      System.out.println("Name: " + john.getName() + 
                         ", Age: " + john.getAge());

      Employee jane = new Employee("Jane Doe", 33);
      System.out.println("Name: " + jane.getName() + 
                         ", Age: " + jane.getAge());

      Employee john2 = new Employee("John Doe", 27 + 2);
      System.out.println("Name: " + john2.getName() + 
                         ", Age: " + john2.getAge());

      Employee john3 = new Employee("John Doe", 30 - 1);
      System.out.println("Name: " + john3.getName() + 
                         ", Age: " + john3.getAge());

      System.out.println();

      // Demonstrate reflexivity.

      System.out.println("Demonstrating reflexivity...");
      System.out.println();
      System.out.println("john.equals(john): " + john.equals(john));
      System.out.println();

      // Demonstrate symmetry.

      System.out.println("Demonstrating symmetry...");
      System.out.println();
      System.out.println("john.equals(jane): " + john.equals(jane));
      System.out.println("jane.equals(john): " + jane.equals(john));
      System.out.println("john.equals(john2): " + john.equals(john2));
      System.out.println("john2.equals(john): " + john2.equals(john));
      System.out.println("jane.equals(john2): " + jane.equals(john2));
      System.out.println("john2.equals(jane): " + john2.equals(jane));
      System.out.println();

      // Demonstrate transitivity.

      System.out.println("Demonstrating transitivity...");
      System.out.println();
      System.out.println("john.equals(john2): " + john.equals(john2));
      System.out.println("john2.equals(john3): " + john2.equals(john3));
      System.out.println("john.equals(john3): " + john.equals(john3));
      System.out.println();

      // Demonstrate consistency.

      System.out.println("Demonstrating consistency...");
      System.out.println();
      for (int i = 0; i < 5; i++)
      {
         System.out.println("john.equals(jane): " + john.equals(jane));
         System.out.println("john.equals(john2): " + john.equals(john2));
      }
      System.out.println();

      // Demonstrate the null check.

      System.out.println("Demonstrating null check...");
      System.out.println();
      System.out.println("john.equals(null): " + john.equals(null));
   }
}