
package jointAccount.person;
import jointAccount.database.Account;

public class AccountHolder implements Runnable
{
    private Account account;
    public AccountHolder(Account account)
    {
        this.account=account;
    }
@Override
    public void run()
    {
        for(int i=0;i<3;i++)
            {
                withdrawing(5000);
            }

       if(account.getBalance()<0)
            {
                 System.out.println("Account overwithdrawn ");
            }
    }
    public synchronized void withdrawing(double withdrawAmt)
    { 
        if(account.getBalance()>=withdrawAmt)
        {
            System.out.println(Thread.currentThread().getName()+" is withdrawing : "+withdrawAmt);
            account.withdraw(withdrawAmt);
            System.out.println(Thread.currentThread().getName()+" "+" has withdrawn : "+withdrawAmt);
        }
        else
        {
            System.out.println("Insufficient amount for "+Thread.currentThread().getName());
        }
    }
}

    