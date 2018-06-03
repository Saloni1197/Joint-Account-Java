package JointAccount.person;

import java.util.Random;
import java.util.Date;
import jointAccount.database.Account;


public class AccountHolders implements Runnable {

    Date date=new Date(); //creating the object of Date class
    private String name;
    //private final int iterations=35; //Number of withdrawls
    private final Account account;
    int withdraw_amt;
    
    public AccountHolders(Account account)
        {
            this.account=account;
        }
 
    //method to obtain the name of the client
    public StringBuilder getName()
        {
            StringBuilder randstr=new StringBuilder("Client");
            Random randnumber=new Random();
            int number;
            number=1+randnumber.nextInt(5);
            randstr.append(number);
            return randstr;
        }
    
    //implementing run method
    @Override
    public void run()
        {
            withdraw_amt=account.getRandomAmount(); //gives the amount to be withdrawn 
            withdraw(withdraw_amt);
            System.out.println("Remaining Balance : Rs "+account.getBalance());//printing the remaining balance in the account
        }
    
    public synchronized void withdraw(int withdraw_amt)
        {
            if( withdraw_amt<=account.getBalance())
                {
                    account.withdrawing(withdraw_amt);
                    System.out.println(getName()+" has withdrawn Rs. "+ withdraw_amt+ " at time : "+date.toString());
                }
            //If the ammount to be withdrawn is greater than the amount present in the account,but account is non empty
            else if(withdraw_amt>account.getBalance() && account.getBalance()!=0)
                {
                    System.out.println("TRANSACTION FAILED : Insufficient amount in the account for the transaction of Rs. "+withdraw_amt);
                }
            else
                {
                      System.out.println("TRANSACTION FAILED : Your account is empty");

                }
        }
}
