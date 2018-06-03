package jointAccount.database;
import java.util.Random;

public class Account    
    {
    
    private int balance=10000; //Initial amount in the account
    private static final int Rand_max_Amount=1000;
    private static final int Rand_min_Amount=100;
  
            //Method to gt the random amount to be withdrawn
            public int getRandomAmount()
                {
                    Random randomAmount;
                    randomAmount = new Random();
                    int randAmount;
                    randAmount=randomAmount.nextInt((Rand_max_Amount-Rand_min_Amount)+1);
                    return randAmount;
                }
                   
            //getting the balance in the account
            public int getBalance()
                {
                    return balance;
                }
            
            //method to withdraw ammount
            public void withdrawing(int randAmount)
                {
                    balance=balance-randAmount;
                }
     }