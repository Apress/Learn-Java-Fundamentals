class AccountDemo
{
   public static void main(String[] args)
   {
      SavingsAccount sa = new SavingsAccount(40000);
      System.out.println("account name: " + sa.getName());
      System.out.println("initial amount: " + sa.getAmount());
      sa.deposit(3500);
      System.out.println("new amount after deposit: " + sa.getAmount());

      CheckingAccount ca = new CheckingAccount(2000);
      System.out.println("account name: " + ca.getName());
      System.out.println("initial amount: " + ca.getAmount());
      ca.deposit(6000);
      System.out.println("new amount after deposit: " + ca.getAmount());
      ca.withdraw(1500);
      System.out.println("new amount after withdrawal: " + ca.getAmount());
   }
}