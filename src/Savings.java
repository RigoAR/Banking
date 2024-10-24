public class Savings extends Account{

    public Savings(String name, int taxID, double balance)
    {
        this.name = name;
        this.taxID = taxID;
        this.balance = balance;
    }

    public Savings()
    {

    }

    //This method allows for withdraws of user inout amount as well as keeping track of them. It also checks whether or not they have enough
    public void DoWithdraw(double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            last10withdraws[numWithdraws % 10] = amount;
            numWithdraws++;
        }
        else
        {
            System.out.println("Insufficient funds to write to take out " + amount);
        }
    }

    public void displayName()
    {
        super.displayName();
        System.out.println("Withdraw Record");
        for(int i = 0; i < numWithdraws; i++)
        {
            System.out.println("Withdrawn $: " + last10withdraws[i]);
        }
        for(int i = 0; i < numDeposits; i++)
        {
            System.out.println("Deposited $: " + last10deposits[i]);
        }


    }
}
