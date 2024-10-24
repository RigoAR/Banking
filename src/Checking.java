public class Checking extends Account{

    private int last10checks[] = new int[10];

    public Checking(String name, int taxID, double balance)
    {
        this.name = name;
        this.taxID = taxID;
        this.balance = balance;
    }
    public Checking()
    {


    }

    //writes check with check number which stores it in an array to display later as well as a withdraw
    public void WriteCheck(int checknum, double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            last10withdraws[numWithdraws % 10] = amount;
            last10checks[numWithdraws % 10] = checknum;
            numWithdraws++;
        }
            else
            {
                System.out.println("Insufficient funds to write Check #" + checknum);
            }
        }

        //displays 10 transactions including now or in array
        public void displayName()
        {
            super.displayName();
            System.out.println("Check Register");
            for(int i = 0; i < numWithdraws; i++)
            {
                System.out.println("Check Number: " + last10checks[i] + " Withdrawn $: " + last10withdraws[i]);
            }
            for(int i = 0; i < numDeposits; i++)
            {
                System.out.println("Deposited $: " + last10deposits[i]);
            }
        }





    }


