
package JointAccount;

import JointAccount.person.AccountHolders;
import jointAccount.database.Account;
        
public class Main 
    {
        private final static int iterations=15; //Number of withdrawls
        public static void main(String[] args)
            {
                Account account=new Account();
                AccountHolders accountholder=new AccountHolders(account);
                for(int i=0;i<iterations;i++)
                {
                    Thread client=new Thread(accountholder);
                    client.setName(accountholder.getName().toString()); //providing name to the current thread 
                    client.start();
                }
            }        
   
    }