
package jointAccount.database;

public class Account {
    private double balance=10000;
    
    public double getBalance()
    {
        return balance;
        
    }
    public void withdraw(double amount){
        balance=balance-amount;
        }
    }
