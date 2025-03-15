import java.util.Scanner;
public class Distance {
    private double feet;
    private double inches;
    Distance () {
        feet=1;
        inches=1;
    }
    Distance(double inputFeet, double inputInches ) {
        feet=inputFeet;
        inches=inputInches;
    }
    public void getFeet(double inputFeet) {
        System.out.printf("\nEnter length in feet: %.2f\n", inputFeet);
    }
    public void getInches(double inputInches) {
        System.out.printf("\nEnter length in inches: %.2f\n", inputInches);
    }
    public void display() {
        System.out.printf("\nThe default distance in feet is:", feet);
        System.out.printf("\nThe default distance in inches is:" ,inches);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Distance measurement=new Distance();
        measurement.display();


    }
}
