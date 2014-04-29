/**
 * Created by Giuseppe on 4/22/2014.
 */

import java.util.*;
import java.text.*;
public class Ch8Ex7 {

    public static void main (String[] args){
        DecimalFormat df = new DecimalFormat("##.##");
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate((4.5));
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("The balance is: " + df.format(account.getBalance()));
        System.out.println("The Monthly interest rate is:" + df.format(account.getMonthlyInterest()));
        System.out.println("The account was created on: " + account.getDateCreated().toString());
    }
}

class Account{

    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;

    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    Account(int ID, double BALANCE){
        id = ID;
        balance = BALANCE;
        dateCreated = new Date();
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterest(){
        double monthlyInterest = annualInterestRate / 12;
        return monthlyInterest;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
