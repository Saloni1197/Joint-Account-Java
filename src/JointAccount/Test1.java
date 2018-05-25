/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jointAccount;

import jointAccount.database.Account;
import jointAccount.person.AccountHolder;
        
public class Test1 
    {

    public static void main(String[] args)
        {
            Account account = new Account();
            AccountHolder a1 = new AccountHolder(account);
            Thread t1=new Thread(a1);
            Thread t2=new Thread(a1);
          
            t1.setName("ABC");
            t2.setName("XYZ");
            
            t1.start();
            t2.start();
        }
}

   
