public class BalanceOfTheAccount
{
    private double balance;
    public void deposit(double amount);
    {
        balance+=amount;
    }
    public void withdarw(double amount);
    {
        balance-=amount;
    }
    public double getBalance()
    {
        return balance;
    }

}
