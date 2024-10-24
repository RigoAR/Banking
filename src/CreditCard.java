public class CreditCard extends Account{
    private int cardNumber;

    private String last10charges[] = new String[10];

    public CreditCard(String n, int t, double b)
    {
        this.name = n;
        this.taxID = t;
        this.balance = b;
    }

    //adds up to balance already on credit and keeps track of it and checks if user has enough funds
    public void DebitCharge( String name, double amount )
    {
        if (amount <= balance)
        {
            balance += amount;
            last10withdraws[numWithdraws % 10] = amount;
            last10charges[numWithdraws % 10] = name;
            numWithdraws++;
        }
        else
        {
            System.out.println("Insufficient funds to charge " + name + ": $" + amount);
        }

    }

    //makes payment onto balance owed in credit card and checks if user has enough money to make payment and also keeps track of deposits into this account
    public void MakePayment( double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            last10deposits[numDeposits % 10] = amount;
            numDeposits++;
        }
        else
        {
            System.out.println("Insufficient funds to pay " + amount);
        }


    }

    public void displayName()
    {
        super.displayName();
        System.out.println("Account Records: ");
        for(int i = 0; i < numWithdraws; i++)
        {
            System.out.println("Item: " + last10charges[i] + "Withdrawn $: " + last10withdraws[i]);
        }

        System.out.println("Deposit Records: ");
        for(int i = 0; i < numDeposits; i++)
        {
            System.out.println("Deposited $: " + last10deposits[i]);
        }
    }
}
