package bankaccountsaskisi;

import MyClasses.BankAccount;
import static MyClasses.BankAccount.accountCall;
import MyClasses.Person;
import java.util.Scanner;
public class BankAccountsAskisi {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

// Agnoiste to auto
//        System.out.println("Do you want to create a new bank account? Y/N ");
//        String loopYN = user.next();
//        
//        boolean checkLoopYN = (loopYN.equals("Y"));
//        
//        while(checkLoopYN==true){
        BankAccount acc = accountCall(user);

        acc.deposit(user);
        System.out.println(acc.getTransactions() + " " + acc.getAmount());

        acc.withdraw(user);
        System.out.println(acc.getTransactions() + " " + acc.getAmount());
        System.out.println("-------------------------");
        BankAccount acc2 = accountCall(user);

        acc2.deposit(user);
        System.out.println(acc2.getTransactions() + " " + acc2.getAmount());

        acc2.withdraw(user);
        System.out.println(acc2.getTransactions() + " " + acc2.getAmount());
        System.out.println("--------------------------");
        System.out.println("Bank accounts opened: " + BankAccount.getAccountsOpened());
        System.out.println(acc.getName() + " Account " +acc.getNumber()+ " History: " + acc.getTransactions());
        System.out.println(acc2.getName() + " Account " +acc2.getNumber()+ " History: " + acc2.getTransactions());
        System.out.println("--------------------------");
        
        Person person1 = new Person("Bary",35,acc);
        Person person2 = new Person("Marie",33,acc2);
        
        person1.accountCall();
        person2.accountCall();
        
    }

}
