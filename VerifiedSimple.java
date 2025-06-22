//files used are simple, verifiedSimple and main5
public class VerifiedSimple extends Simple{

    public VerifiedSimple(double number1, double number2) {
        super(number1, number2);
    }
    @Override
    public void add() {
        if (number1>0 && number2>0) {
            super.add();
        }
        else {
            System.out.println("Error: Both numbers must be greater than 0 for addition.");
        }
    }
    @Override
    public void sub() {
        if (number1 > 0 && number2 > 0) {
            super.sub();
        } else {
            System.out.println("Error: Both numbers must be greater than 0 for subtraction.");
        }
    }
    public void mul() {
        if (number1 > 0 && number2 > 0) {
            super.mul();
        } else {
            System.out.println("Error: Both numbers must be greater than 0 for multiplication.");
        }
    }

    @Override
    public void div() {
        if (number1 > 0 && number2 > 0) {
            super.div();
        } else {
            System.out.println("Error: Both numbers must be greater than 0 for division.");
        }
    }
}
