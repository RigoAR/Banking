/* Name: Rigoberto Alvarado-Rayo
# Date: 9/27/2023
# Class: CSC 1120
# Pledge: I have neither given nor received unauthorized aid on this
program.
# Description:
The Account class is the parent class to the others. I made it so that it runs like a small little bank that includes a
checking, saving, and credit card account. It functions like a little bank which includes my name and tax ID number. It
keeps track of any user's input transactions and updates them in relation to each other. It also keeps track of past transactions.
# Input:
The user gets to choose between options 1-10. Each of them is different and whichever is input can be ran. If they were to input 10,
the system would exit.
# Output:
The output can vary based on the input. If the input was nine, it would run case 9 and display credit card transactions.

 */
public class Account {
    protected String name;
    protected int taxID;

    protected double[] last10deposits = new double[10];

    protected double[] last10withdraws = new double[10];

    protected double balance;

    protected int numDeposits;

    protected int numWithdraws;


    public Account() {
        name = " ";
        taxID = 0;
        balance = 0.0;

    }


    public Account(String n, int t, double b) {
        this.name = n;
        this.taxID = t;
        this.balance = b;
    }

    //sets new balance based on user input and checks if it is a valid number
    public void setBalance(double newBalance) {
        if (newBalance > 0) {
            balance = newBalance;
        } else {
            System.out.println("Please enter a valid balance.");
        }
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setTaxID(int newTaxID) {
        taxID = newTaxID;
    }

    public double getBalance() {
        return balance;
    }

    public int getTaxID() {
        return taxID;
    }

    public String getName() {
        return name;
    }

    //It takes in an amount and sets it to the balance while updating it in an array of 10
    public void MakeDeposit(double amount) {

        balance = balance + amount;
        if (numDeposits < 10) {
            last10deposits[numDeposits] = amount;
            numDeposits++;
        }
        else
        {
            numDeposits = 0;
            last10deposits[numDeposits] = amount;
        }
    }

   //Prints name, taxID, balance
    public void displayName() {
        System.out.println("Name: " + name);
        System.out.println("TaxID: " + taxID);
        System.out.println("Balance: " + balance);
    }
}



