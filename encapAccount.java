public class encapAccount {
    private double balance;
    public encapAccount () {
        balance=0;
    }
    public encapAccount (double inputBalance) {
        this.balance=inputBalance;
    }
    public double getBalance () {
        return balance;
    }
    public void withdrawAmount(double amount) {
        if (balance>=amount && amount>0) {
            balance-=amount;
            System.out.printf("\nAmount Withdrawn:%.2f ", amount);
        }
        else if (amount>balance) {
            System.out.printf("\nInsuffiecent balance\n");
        }
        else {
            System.out.printf("\nAmount must be positive!\n");
        }
    }
    public void deposit(double amount) {
        if (amount<=0) {
            System.out.println("Enter a valid amount to deposit");
        }
        else {
            balance+=amount;
            System.out.println("\nAmount successfully deposited!\n");
        }
    }
    public void display () {
        System.out.printf("\nThe balance is:%.2f ", balance);
       }
    public static void main(String[] args) {
        encapAccount balance2=new encapAccount(1000);
        balance2.display();
        balance2.withdrawAmount(500);
        balance2.display();
        balance2.deposit(4000);
        balance2.display();
    }
}
