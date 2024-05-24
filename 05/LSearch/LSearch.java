class LSearch
{
   public static void main(String[] args)
   {
      int[] grades = { 86, 92, 68, 75, 79, 81 };

      int gradeToSearch = 68;
      int i;
      for (i = 0; i < grades.length; i++)
         if (grades[i] == gradeToSearch)
         {
            System.out.println("Found " + gradeToSearch + " at position " + i);
            break;
         }
      if (i == grades.length)
         System.out.println("Could not find " + gradeToSearch);

      gradeToSearch = 74;
      for (i = 0; i < grades.length; i++)
         if (grades[i] == gradeToSearch)
         {
            System.out.println("Found " + gradeToSearch + " at position " + i);
            break;
         }
      if (i == grades.length)
         System.out.println("Could not find " + gradeToSearch);
   }
}