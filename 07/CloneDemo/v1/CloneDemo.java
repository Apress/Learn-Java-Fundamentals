class Date
{
   private int year, month, day;

   Date(int year, int month, int day)
   {
      this.year = year;
      this.month = month;
      this.day = day;
   }

   int getDay()
   {
      return day;
   }

   int getMonth()
   {
      return month;
   }

   int getYear()
   {
      return year;
   }
}

class Employee implements Cloneable
{
   private String name;
   private int age;
   private Date hireDate;

   Employee(String name, int age, Date hireDate)
   {
      this.name = name;
      this.age = age;
      this.hireDate = hireDate;
   }

   String getName()
   {
      return name;
   }

   int getAge()
   {
      return age;
   }

   Date getHireDate()
   {
      return hireDate;
   }

   @Override
   public Object clone() throws CloneNotSupportedException
   {
      return super.clone();      
   }
}

class CloneDemo
{
   public static void main(String[] args) throws CloneNotSupportedException
   {
      Employee john = new Employee("John Doe", 37, new Date(1999, 10, 8));
      System.out.println("Name: " + john.getName() + 
                         ", Age: " + john.getAge() +
                         ", Hire Date: " + john.getHireDate());

      Employee john2 = (Employee) john.clone();
      System.out.println("Name: " + john2.getName() + 
                         ", Age: " + john2.getAge() +
                         ", Hire Date: " + john2.getHireDate());
   }
}