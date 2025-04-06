public class Fractions {
    private int numerator;
    private int denominator;
    public int getNumerator () {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator=numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator=denominator;
    }
    public Fractions() {
        numerator=1;
        denominator=1;
    }
    public Fractions(int numerator, int denominator) {
        if(denominator==0) {
            System.out.println("The denominator cannot be zero");
            return;
        }
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public void display() {
       System.out.println("The fraction is: " + numerator+"/" + denominator);
    }
    public boolean equals(Fractions other) {
        return (this.numerator*other.denominator)==(this.denominator*other.numerator);
    }
    public static void main(String[] args) {
        Fractions fraction=new Fractions();
        fraction.setNumerator(10);
        fraction.setDenominator(4);
        fraction.display();
        Fractions fraction2=new Fractions(5, 2);
        fraction2.display();
        if(fraction.equals(fraction2)) {
            System.out.println("The fractions are equal!");
        }
        else {
            System.out.println("Fractions are not equal!");
        }
    }

}
