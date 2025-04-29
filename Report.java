//files used address1 and person2.
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
    public static void numOfPeople() {
        Scanner input=new Scanner(System.in);
        int numOfPeople=0;
        System.out.print("Enter the number of people you want to register:");
        numOfPeople=input.nextInt();
        input.nextLine();
        addresses=new Address1[numOfPeople];
        System.out.println("Slots created! Enter data for " + numOfPeople+ " people!");
    }
    public static void inputData(Person2 [] persons, int numOfPeople) {
        Scanner input=new Scanner(System.in);
        int counter=0;
        for (int i=0; i<numOfPeople; i++) {
            System.out.println("Data for person " + i+1);
            System.out.println("Enter name: ");
            String inputName=input.nextLine();
            System.out.println("Entering address of person " + i+1);
            System.out.println("Enter country: ");
            String inputCountry=input.nextLine();
            System.out.println("Enter city: ");
            String inputCity=input.nextLine();
            System.out.println("Enter street name: ");
            String inputstreetName=input.nextLine();
            System.out.println("Enter house number:");
            int inputHouseNum=input.nextInt();
            Address1 address=new Address1(inputCity, inputCountry, inputstreetName, inputHouseNum);
            persons[i]=new Person2(inputName, address);
        }
    }
    public static void searchData(int counter, Person2[] person) {
        System.out.println("Enter the name to edit information");
        String searchName=input.nextLine();
        String newName="";
        char inputOpt='a';
        Person2 editDetails=new Person2();
        for (int i=0; i<counter; i++) {
            if (person[i]!=0 && people[i].getName().equalsIgnoreCase(searchName)) {
                System.out.print("Do you want to edit name or address? (N/A):");
                inputOpt=input.next().charAt(0);
                if (inputOpt.equalsIgnoreCase("N")) {
                    System.out.println("You have choosen to edit the name");
                    System.out.print("Enter new name:");
                    newName=input.nextLine();
                    person[i].setName(newName);
                    System.out.println("Name has been updated");
                }
                if (inputOpt.equalsIgnoreCase("A")) {
                    System.out.println("You have choosen to edit address");
                    System.out.print("Enter new country:");
                    String newCountry=input.nextLine();
                    System.out.print("Enter new city:");
                    String newCity=input.nextLine();
                    System.out.print("Enter the street name:");
                    String newStreetName=input.nextLine();
                    System.out.print("Enter house number:");
                    int newHouseNum=input.nextInt();
                    input.nextLine();
                    Address1 newAddress=new Address1(newCity, newCountry, newStreetName, newHouseNum);
                    person[i].setAddress(newAddress);
                    System.out.println("Address has been updated!");
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Address1 [] addresses= new Address1[100];
        Person2 [] person=new Person2[100];
        int option=-99;
        int numOfPeople=0;
        while (option!=0) {
            displayMenu();
            option=input.nextInt();
            input.nextLine();
            switch(option) {
                case 1:
                person=new Person2[numOfPeople];
                break;
                case 2:
                inputData(person, numOfPeople);
                break;
                case 3:

                case 4:
                case 5:
                case 0:

            }

        }
    }
}
