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
    public void display() {
        System.out.printf("\nThe distance in feet is: %.2f", feet);
        System.out.printf("\nThe distance in inches is: %.2f" ,inches);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Distance measurement1=new Distance();
        System.out.println("The default measurements!\n");
        measurement1.display();
        System.out.printf("\nEnter the feet:");
        double Infeet=input.nextDouble();
        System.out.printf("\nEnter the inches: ");
        double Ininches=input.nextDouble();
        Distance measurement2=new Distance(Infeet, Ininches);
        measurement2.display();
        input.close();

    }
}
