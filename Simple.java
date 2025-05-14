public class Simple {
    private double number1;
    private double number2;
    public Simple() {
        number1=1l
        number2=1;
    }
    public Simple(double number1, double number2) {
        this.number1=number1;
        this.number2=number2;
    }
    public double add(double number1, double number2) {
        double add=number1+number2;
        return add;
    }
    public double sub(double number1, double number2) {
        double sub=number1-number2;
        return sub;
    }
    public double mul(double number1, double number2) {
        double multiply=number1*number2;
        return multiply;
    }
    public double divide (double number1, double number2) {
        double divide=number1/number2;
        return divide;
    }
}
