//lab task 2
import java.util.Scanner;
public class Account {
   private double balance;
   public Account () {
    balance=0.0;
   }
   public Account(double initialBalance) {
    if (initialBalance>=0.0) {
        balance=initialBalance;
    }
    else {
        System.out.printf("Initial Balance cannot be negative");
        balance=0.0;
    }
   }
   public void deposit(double amount) {
    if (amount>0) {
        balance+=amount;
        System.out.printf("Deposited:%.2f\n", amount);
    }
    else {
        System.out.printf("Error!! Deposited amount must be positive");
    }
   }
   public void withdraw(double amount) {
    if (balance>=amount && amount>0) {
        balance-=amount;
        System.out.printf("Amount Withdrawn:%.2f\n ", amount);
    }
    else if (amount>balance) {
        System.out.printf("\nInsuffiecent balance\n");
    }
    else {
        System.out.printf("\nAmount must be positive!\n");
    }
   }
   public void display () {
    System.out.printf("\nThe balance is: %.2f\n", balance);
   }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Account defaultAmount= new Account();
        defaultAmount.display();
        System.out.printf("Enter initial balance:");
        double inputBalance=input.nextDouble();
        Account userAccount=new Account(inputBalance);
        System.out.print("Do you want to withdraw or deposit?: (W/D)");
        String choice=input.next();
        if (choice.equalsIgnoreCase("D")) {
            System.out.printf("\nEnter amount to deposit:");
            double depositAmount=input.nextDouble();
            userAccount.deposit(depositAmount);
            userAccount.display();
        }
        if (choice.equalsIgnoreCase("W")) {
            System.out.printf("\nEnter amount to withdraw:");
            double withdrawAmount=input.nextDouble();
            userAccount.withdraw(withdrawAmount);
            userAccount.display();
        }
        input.close();
    }
}

