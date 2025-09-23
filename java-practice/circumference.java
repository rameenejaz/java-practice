import java.util.Scanner;
public class circumference {
    public float calculateCircumference (float radius) {
        return (2*3.14f*radius);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        float inputRadius=input.nextFloat();
        circumference object= new circumference();
        float result=object.calculateCircumference(inputRadius);
        System.out.println("The circumference is: " + result);
        input.close();
    }
}


