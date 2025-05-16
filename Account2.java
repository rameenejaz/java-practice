import java.util.Scanner;
public class Account2 {
    private double balance;
    private String accountNumber;
    public Account2() {
        balance=0.0;
        accountNumber="";
    }
    public Account2(double balance, String accountNumber){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    public void withdraw() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the account number you want to perform operation on:");
        String inputAccountNum=input.nextLine();
        if (inputAccountNum.equals(inputAccountNum)) {
            System.out.print("Enter the amount you want to withdraw:");
            int amount=input.nextInt();
            input.nextLine();
            if (amount<0) {
                System.err.println("Invalid amount!");
                return;
            }
            if (amount>=0 && amount<balance) {
                balance-=amount;
                System.out.println(amount +" withdrawn, your new balance is: ", balance);
            }
        }
    }
    public void deposit() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the account number you want to perform operation on:");
        String inputAccountNum=input.nextLine();
        if (inputAccountNum.equals(inputAccountNum)) {
        System.out.print("Enter the amount you want to deposit:");
        int amount=input.nextInt();
        input.nextLine();
            if (amount<0) {
            System.err.println("Invalid amount!");
            return;
            }
            if (amount>=0 && amount<balance) {
            balance+=amount;
            System.out.println(amount +" deposited, your new balance is: ", balance);
            } 
        }
    }
    public double balanceInquiry() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the account number you want to perform operation on:");
        String inputAccountNum=input.nextLine();
        if (inputAccountNum.equals(inputAccountNum)) {
            return balance;
        }
    }


}
