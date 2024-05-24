class Date
{
   private int year, month, day;

   Date(int year, int month, int day)
   {
      this.year = year;
      this.month = month;
      this.day = day;
   }

   int getYear()
   {
      return year;
   }

   int getMonth()
   {
      return month;
   }

   int getDay()
   {
      return day;
   }
}

class CloneDemo
{
   public static void main(String[] args)
   {
      int[] populations = { 100000000, 50000000, 10000 };
      for (int i = 0; i < populations.length; i++)
         System.out.print(populations[i] + " ");
      System.out.println();

      int[] populations2 = populations.clone();
      for (int i = 0; i < populations.length; i++)
         System.out.print(populations[i] + " ");
      System.out.println();

      System.out.println();

      Date[] dates = { new Date(1983, 10, 15), new Date(2022, 5, 6) };
      for (int i = 0; i < dates.length; i++)
         System.out.print(dates[i] + " ");
      System.out.println();

      Date[] dates2 = dates.clone();
      for (int i = 0; i < dates.length; i++)
         System.out.print(dates[i] + " ");
      System.out.println();
   }
}