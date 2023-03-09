public class BankAccounts
{
    public static void main(String[] args)
    {
        BankAccount Account=new BankAccount();
        Account.deposit(2000);
        Account.withdraw(500);
        System.out.println(Account.getBalance);

    }
}
