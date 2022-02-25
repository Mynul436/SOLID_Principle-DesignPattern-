import java.util.Scanner;

public class BankMainApplication extends BankService{

    public BankMainApplication(String customerName, String customerId) {
        super(customerName, customerId);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankService obj1 =new BankService(sc.nextLine(),sc.nextLine());
        obj1.showMenu();
    }
}
