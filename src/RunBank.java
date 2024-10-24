import java.util.Scanner;
public class RunBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Checking checking = new Checking("Rigoberto", 30430424, 100);
        Savings savings = new Savings("Rigoberto", 30430424, 100);
        CreditCard credit = new CreditCard("Rigoberto", 30430424, 100);


        boolean run = false;
        System.out.println("Hello, User!");


        //Is able to run all of them continuously while condition stays false based on inputs but is stopped when 10 is pressed which turns condition true.
        //Also is able to do everything named on menu from 1-10
        //Is able to update values as well as ask for user input.
        while (!run) {
            System.out.println("\n" + """
                    Welcome to Rigo's Robabank
                    **************************
                    MENU:
                    1. Savings Deposit
                    2. Savings Withdraw
                    3. Checking Deposit
                    4. Write A Check
                    5. Credit Card Payment
                    6. Make A Charge
                    7. Display Savings
                    8. Display Checking
                    9. Display Credit Card
                    10. Exit
                    Select Option(1 - 10):""");
            int input = scan.nextInt();

            switch (input) {

                case 1: {
                    System.out.println("Enter the amount you would like to deposit.");
                    double d = scan.nextDouble();
                    savings.MakeDeposit(d);
                    System.out.println("New balance: " + savings.getBalance());
                    break;
                }
                case 2: {
                    System.out.println("Enter the amount you would like to withdraw.");
                    double d = scan.nextDouble();
                    savings.DoWithdraw(d);
                    System.out.println("New balance: " + savings.getBalance());
                    break;
                }
                case 3: {
                    System.out.println("Enter the amount you would like to deposit.");
                    double d = scan.nextDouble();
                    checking.MakeDeposit(d);
                    System.out.println("New balance: " + checking.getBalance());
                    break;
                }
                case 4: {
                    System.out.println("Enter your check number.");
                    int i = scan.nextInt();
                    System.out.println("Enter the amount you would like to write a check for.");
                    double d = scan.nextDouble();
                    checking.WriteCheck(i, d);
                    System.out.println("New balance: " + checking.getBalance());
                    break;
                }
                case 5: {
                    System.out.println("Enter the amount you would like to pay.");
                    double d = scan.nextDouble();
                    credit.MakePayment(d);
                    System.out.println("New balance: " + credit.getBalance());
                    break;
                }
                case 6: {

                    System.out.println("What item would you like to purchase?");
                    String z = scan.nextLine();
                    System.out.println("Enter the amount it cost.");
                    double n = scan.nextDouble();
                    credit.DebitCharge(z, n);
                    System.out.println("New balance: " + credit.getBalance());
                    break;
                }
                case 7: {
                    savings.displayName();
                    break;
                }
                case 8: {
                    checking.displayName();
                    break;
                }
                case 9: {
                    credit.displayName();
                    break;
                }
                case 10: {
                    System.out.println("Exiting Rigo's Robabank! Come back soon!");
                    run = true;
                    break;
                }

            }


        }


    }
}
