import java.util.Scanner;

public class BankService {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    public BankService(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void deposit(int amount)
    {
        //deposit amount

        if(amount!=0)
        {
            balance+=amount;
        }

    }
    public void withDraw(int amount)
    {
        if(amount!=0){
            balance=balance-amount;
            previousTransaction=-balance;
        }
    }

    public void getPreviousTransaction() {
        if(previousTransaction>0){
            System.out.println("Deposited : "+previousTransaction);

        }
        else if(previousTransaction<0)
        {
            System.out.println("Withdraw : "+Math.abs(previousTransaction));

        }
        else
            System.out.println("No transaction occured");

    }
    void showMenu(){
        char option='\0';
        Scanner scanner =new Scanner(System.in);

        System.out.println("Welcome "+customerName+"!!!");
        System.out.println("Your Id is :"+customerId);
        System.out.println("\n");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Previous transaction");
        System.out.println("5.Exit");

        do{
            System.out.println("------------------------------------------------------");
            System.out.println("Enter an option");
            System.out.println("------------------------------------------------------");
            option=scanner.next().charAt(0);
            System.out.println("\n");


            switch (option)
            {
                case '1':
                    System.out.println("------------------------------------------------------");
                    System.out.println("Balance = "+balance);
                    System.out.println("------------------------------------------------------");
                    System.out.println("\n");
                    break;
                case '2':
                    System.out.println("------------------------------------------------------");
                    System.out.println("Enter an amount to deposit:");
                    System.out.println("------------------------------------------------------");
                    int amount =scanner.nextInt();
                    deposit(amount);

                    System.out.println("\n");
                    break;
                case '3':
                    System.out.println("------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("------------------------------------------------------");
                    int amount2=scanner.nextInt();
                    withDraw(amount2)
                    ;
                    System.out.println("\n");
                    break;

                case '4':
                    System.out.println("------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("------------------------------------------------------");
                    System.out.println("\n");
                    break;
                case '5':
                    System.out.println("Exit!!!");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }

        }while (option!='5');
        System.out.println("Thanks for using our service");

    }
}
