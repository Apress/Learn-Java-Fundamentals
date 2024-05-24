class CheckingAccount extends Account
{
   CheckingAccount(long amount)
   {
      super("checking", amount);
   }

   void withdraw(long amount)
   {
      setAmount(getAmount() - amount);
   }
}