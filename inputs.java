import java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your first name:");
        String firstName=input.nextLine();
        System.out.print("Enter your age:");
        int age=input.nextInt();
        System.out.print("Enter book price:");
        double price=input.nextDouble();
        System.out.print("Enter your height:");
        float height=input.nextFloat();
        input.nextLine();
        System.out.print("Enter your last name:");
        String lastName=input.nextLine();
        System.out.println("Printing details");
        System.out.println("First Name:"+firstName);
        System.out.println("Age:"+age);
        System.out.println("Price: $"+price);
        System.out.println("Height:"+height);
        System.out.print("Last name:"+lastName);
        input.close();
    }
}
