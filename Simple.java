//files used are simple, verifiedSimple and main5
public class Simple {
    protected double number1;
    protected double number2;
    public Simple() {
        number1=1;
        number2=1;
    }
    public Simple(double number1, double number2) {
        this.number1=number1;
        this.number2=number2;
    }
    public void add() {
        double add=number1+number2;
        System.out.println("Addition: " + add);
    }
    public void sub() {
        double sub=number1-number2;
        System.out.println("Subtraction: " + sub);
    }
    public void mul() {
        double multiply=number1*number2;
        System.out.println("Multiplication: " + multiply);
    }
    public void div () {
        if (number2!=0) {
            double divide=number1/number2;
            System.out.println("Division: " + divide);
        }
        else {
            System.out.println("Error, division with zero is not possible");
        }
    }
}
