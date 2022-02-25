public class BankService {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;
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
}
