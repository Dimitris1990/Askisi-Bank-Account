package MyClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankAccount {

    private int number;
    private double amount;
    private String name;
    private boolean active;
    private List<String> transactions;
    private static int accountsOpened;
//    private Random random = new Random();
    
    
    
    //signomi pou xrisimopoiisa aplous periorismous...kourastika polu

    //Constructors
    public BankAccount() {

        active = true;
        transactions = new ArrayList();
        transactions.add("New Account");
        accountsOpened++;
    }

    public BankAccount(String name, int number) {

        this();
        this.name = name;
        this.number = number;
    }

    public BankAccount(String name, int number, double amount) {

        this(name, number);
        this.amount = amount;
    }

    //Setters & Getters
    //NAME
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    //NUMBER
    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    //AMOUNT
    public double getAmount() {

        return amount;
    }

    //METHODS
    //ACCOUNTSOPENED
    public static int getAccountsOpened() {
        return accountsOpened;
    }

    //DEPOSIT
    public void deposit(Scanner user) {

        System.out.println("Do you want to deposit money to the account? ");

        String depYN = user.next();

        if (depYN.equals("Y")||depYN.equals("y")) {

            System.out.println("Give an amount you want to deposit: ");
            double depAmount = user.nextDouble();

            if (depAmount < 0.01) {
                System.out.println("Insufficient amount.");
            } else {
                amount += depAmount;
                transactions.add("Amount deposited :" + depAmount + " euros. " + "New amount: " + amount + " euros. ");
            }
        }

    }

    //WITHDRAW
    public void withdraw(Scanner user) {

        System.out.println("Do you want to withdraw money from the account? ");
        String wtdYN = user.next();

        if (wtdYN.equals("Y")||wtdYN.equals("y")) {

            System.out.println("Give an amount you want to withdraw: ");

            double wtdAmount = user.nextDouble();

            if (amount < wtdAmount) {
                System.out.println("Amount in account not enough.");
            } else {
                amount -= wtdAmount;
                transactions.add("Withdrawal amount :" + wtdAmount + " euros. " + "New amount: " + amount);
            }
        }
    }

    //TRANSACTIONS
    public List<String> getTransactions() {

        return transactions;
    }
    
    
    //Object

    public static BankAccount accountCall(Scanner user) {
        Random random = new Random();
        int randomNumber = random.nextInt(1000000000);
        
        System.out.println("Creating a Bank Account.");
        System.out.println("Give a name for the bank account. ");

        BankAccount account = new BankAccount();
        account.setName(user.next());
        
        account.setNumber(randomNumber);
        
        System.out.println("Account Number: " + randomNumber);
        

        System.out.println(account.getTransactions());

        return account;

    }

}
