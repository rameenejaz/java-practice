//files used address1, name, person2.
import java.util.Scanner;
public class Report {
    public static void displayMenu() {
        System.out.println("---------- MENU----------");
        System.out.println("1. Enter the number of people you want to register:");
        System.out.println("2. To input names and addresses of the people:");
        System.out.println("3. To edit the name or address of a specific person, enter person name:");
        System.out.println("4. To delete data of a specific person, enter name:");
        System.out.println("5. To search and display report of people by city, enter city:");
        System.out.println("Choose one of the following options (1-5) or 0 to exit:");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Address1 [] addresses= new Address[100];
        int option=-99;
        int numOfPeople=0;
        while (option!=0) {
            displayMenu();
            option=input.nextInt();
            input.nextLine();
            switch(option) {
                case 1:
                System.out.print("Enter the number of people you want to register:");
                numOfPeople=input.nextInt();
                input.nextLine();
                addresses=new Address1[numOfPeople];
                System.out.println("Slots created! Enter data for " + numOfPeople+ " people!");
                break;
                case 2:
                for (int i=0; i<numOfPeople; i++) {
                    System.out.println("Enter person " + i + " data: " );
                    
                }

                case 3:
                case 4:
                case 5:
                case 0:

            }

        }
    }
}
