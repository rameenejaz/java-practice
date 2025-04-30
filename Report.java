//files used address1 and person2 and Report
import java.util.Scanner;
public class Report {
    public static void displayMenu() {
        System.out.println("---------- MENU----------");
        System.out.println("1. Enter the number of people you want to register:");
        System.out.println("2. To input names and addresses of the people:");
        System.out.println("3. To edit the name or address of a specific person, enter person name:");
        System.out.println("4. To delete data of a specific person, enter name:");
        System.out.println("5. To search and display report of people by city, enter city:");
        System.out.print("Choose one of the following options (1-5) or 0 to exit:");
    }
    public static void numOfPeople() {
        Scanner input=new Scanner(System.in);
        int numOfPeople=0;
        System.out.print("Enter the number of people you want to register:");
        numOfPeople=input.nextInt();
        input.nextLine();
        Address1 [] addresses=new Address1[numOfPeople];
        System.out.println("Slots created! Enter data for " + numOfPeople+ " people!");
    }
    public static void inputData(Person2 [] persons, int numOfPeople) {
        Scanner input=new Scanner(System.in);
        int counter=0;
        for (int i=0; i<numOfPeople; i++) {
            System.out.println("Data for person " + i+1);
            System.out.print("Enter name: ");
            String inputName=input.nextLine();
            System.out.println("Entering address of person " + i+1);
            System.out.print("Enter country: ");
            String inputCountry=input.nextLine();
            System.out.print("Enter city: ");
            String inputCity=input.nextLine();
            System.out.print("Enter street name: ");
            String inputstreetName=input.nextLine();
            System.out.print("Enter house number:");
            int inputHouseNum=input.nextInt();
            input.nextLine();
            Address1 address=new Address1(inputCity, inputCountry, inputstreetName, inputHouseNum);
            persons[i]=new Person2(inputName, address);
        }
    }
    public static void searchData(int numOfPeople, Person2[] person) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name to edit information");
        String searchName=input.nextLine();
        String newName="";
        char inputOpt = input.next().charAt(0);
        Person2 editDetails=new Person2();
        for (int i=0; i<numOfPeople; i++) {
            if (person[i]!= null && person[i].getName().equalsIgnoreCase(searchName)) {
                System.out.print("Do you want to edit name or address? (N/A):");
                inputOpt=input.next().charAt(0);
                if (inputOpt=='N' || inputOpt=='n') {
                    System.out.println("You have choosen to edit the name");
                    System.out.print("Enter new name:");
                    newName=input.nextLine();
                    person[i].setName(newName);
                    System.out.println();
                    System.out.println("Name has been updated");
                }
                if (inputOpt=='A' || inputOpt=='a') {
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
    public static void deleteSpecific(int numOfPeople, Person2 [] person) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the name of the person you want to delete data of: ");
        String inputName=input.nextLine();
        for (int i=0; i<numOfPeople; i++) {
            if (person[i]!=null && person[i].getName().equalsIgnoreCase(inputName)) {
                person[i]=null;
                System.out.println("Person deleted successfully!");
                return;
            }
            System.out.println("Person not found!");
        }
    } 
    public static void displayData(int numOfPeople, Person2 [] person) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the city you want to search:");
        String inputCity=input.nextLine();
        boolean found=false;
        for (int i=0; i<numOfPeople; i++) {
            if (person[i]!=null && person[i].getaddress().getCity().equalsIgnoreCase(inputCity)) {
                System.out.println("Person has been found");
                found=true;
                person[i].display();
            }
        }
        if (!found) {
            System.out.println("No people in this city!");
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
                System.out.print("Enter the number of people you want to register: ");
                numOfPeople = input.nextInt();
                input.nextLine(); // Clear buffer
                person = new Person2[numOfPeople];
                System.out.println("Slots created for " + numOfPeople + " people!");
                break;
                case 2:
                inputData(person, numOfPeople);
                break;
                case 3:
                searchData(numOfPeople, person);
                break;
                case 4:
                deleteSpecific(numOfPeople, person);
                break;
                case 5:
                displayData(numOfPeople, person);
                break;
                case 0:
                return;
            }

        }
    }
}
