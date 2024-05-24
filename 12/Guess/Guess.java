import java.util.Scanner;

public class Guess
{
   public static void main(String[] args)
   {
      int answer = rnd(100) + 1;

      while (true)
      {
         System.out.print("Enter guess (1 - 100): ");

         int guess = new Scanner(System.in).nextInt();
         if (guess < answer)
         {
            System.out.println("Too low");
            continue;
         }
         else
         if (guess > answer)
         {
            System.out.println("Too high");
            continue;
         }
         else
         {
            System.out.println("Correct");
            break;
         }
      }
   }

   /*
      rnd() - Return random integer.

      Parameters:

      limit - Specifies the largest integer less 1 that
              may be returned. 0 is the smallest integer.

      Return:

      random integer from 0 through limit - 1.
   */

   static int rnd(int limit)
   {
      return (int) (Math.random() * limit);
   }
}