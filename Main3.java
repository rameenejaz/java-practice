//files used are: person3, DOB2, Student3 and Address3, Main3

import java.util.Scanner;

public class Main3 {
    private Person3 [] person=new Person3[100];
    public static void displayMenu() {
        System.out.println("----------------------- MENU--------------------------");
        System.out.println("1. Enter the number of people you want to register");
        System.out.println("2. To input data of the people");
        System.out.println("3: To edit data of student by entering name");
        System.out.println("4: To delete a person by entering their name");
        System.out.println("5: To view list of students month wise"); //ex:display data of all the students when may is entered
        System.out.println("6: To display list of students city wise."); //ex: display data of all those students in lahore
        System.out.println("7: To display data for all");
        System.out.println("0: To exit");
        System.out.println("------------------------------------------------------");
        System.out.print("Choose one of the following options (1-7 or 0 to exit):");
    }
    public static int numOfPeople() {
        Scanner input=new Scanner(System.in);
        int numOfPeople=0;
        System.out.print("Enter the number of people you want to register:");
        numOfPeople=input.nextInt();
        input.nextLine();
        System.out.println("Slots created! Enter data for " + numOfPeople+ " people!");
        return numOfPeople;
    }
    public static void inputData(Person3 [] persons, int numOfPeople) {
        Scanner input=new Scanner(System.in);
        int counter=0;
        for (int i=0; i<numOfPeople; i++) {
            System.out.println("Data for person " + i+1);
            System.out.print("Enter name: ");
            String inputName=input.nextLine();
            System.out.print("Enter ID:");
            int inputID=input.nextInt();
            System.out.println("Entering date of birth of person" + i+1 + ": ");
            System.out.print("Enter day(date): ");
            int inputDay=input.nextInt();
            input.nextLine();
            System.out.print("Enter month:");
            String inputMonth=input.nextLine();
            // input.nextLine();
            System.out.print("Enter year:");
            int inputYear=input.nextInt();
            input.nextLine();
            DOB2 dob=new DOB2(inputDay, inputMonth, inputYear);
            System.out.println("Entering address of person " + i+1 + ": ");
            System.out.print("Enter city: ");
            String inputCity=input.nextLine();
            // input.next()
            System.out.print("Enter house number: ");
            int inputHouseNum=input.nextInt();
            input.nextLine();
            System.out.print("Enter society name: ");
            String inputSocietyName=input.nextLine();
            Address3 address=new Address3(inputCity,inputHouseNum,inputSocietyName);
            persons[i]=new Person3(inputName, inputID,dob,address);
        }
    }
    public static void editData(int numOfPeople, Person3[] person) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the ID to edit information");
        int searchID=input.nextInt();
        String newName="";
        char inputOpt = input.next().charAt(0);
        for (int i=0; i<numOfPeople; i++) {
            if (person[i] != null && person[i].getID() == searchID) {
                System.out.print("Do you want to edit name or address or date of birth? (N/A/D):");
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
                    System.out.println("Entering address of person " + i+1);
                    System.out.print("Enter city: ");
                    String inputCity=input.nextLine();
                    System.out.print("Enter house number:");
                    int inputHouseNum=input.nextInt();
                    input.nextLine();
                    System.out.print("Enter society name: ");
                    String inputSocietyName=input.nextLine();
                    Address3 address=new Address3(inputCity,inputHouseNum,inputSocietyName);
                    person[i].setAddress(address);
                    System.out.println("Address has been updated!");
                    return;
                }
                if(inputOpt=='D' || inputOpt=='d') {
                    System.out.println("Entering date of birth of person" + i+1);
                    System.out.print("Enter day(date)");
                    int inputDay=input.nextInt();
                    input.nextLine();
                    System.out.print("Enter month:");
                    String inputMonth=input.nextLine();
                    // input.nextLine();
                    System.out.print("Enter year:");
                    int inputYear=input.nextInt();
                    input.nextInt();
                    DOB2 dob=new DOB2(inputDay, inputMonth, inputYear);
                    person[i].setDOB(dob);
                }
            }
        }
    }
    public static void deleteSpecific(int numOfPeople, Person3 [] person) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the ID of the person you want to delete data of: ");
        int inputID=input.nextInt();
        for (int i=0; i<numOfPeople; i++) {
            if (person[i]!=null && person[i].getID()==inputID) {
                person[i]=null;
                System.out.println("Person deleted successfully!");
                return;
            }
            System.out.println("Person not found!");
        }
    } 
    public static void displayDataByCity(int numOfPeople, Person3 [] person) {
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
            System.out.println("No data of people in this city!");
        }
    }
    public static void displayDataByMonth(int numOfPeople, Person3 [] person) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the month you want to search:");
        String inputMonth=input.nextLine();
        boolean found=false;
        for (int i=0; i<numOfPeople; i++) {
            if (person[i]!=null && person[i].getDOB().getMonth().equalsIgnoreCase(inputMonth)) {
                System.out.println("Person has been found");
                found=true;
                person[i].display();
            }
        }
        if (!found) {
            System.out.println("No data of people born in this month!");
        }
    }
    public static void displayAll(int numOfPeople, Person3[] person) {
        for (int i=0; i<numOfPeople; i++) {
            if (person[i]!=null) {
                person[i].display();
            }
            System.out.println();
        }
        System.out.println("Data for all has been displayed!");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Person3 [] person=new Person3[100];
        int option=-99;
        int numOfPeople=0;
        while (option!=0) {
            displayMenu();
            option=input.nextInt();
            input.nextLine();
            switch (option) {
            case 1:
            numOfPeople=numOfPeople();
            break;
            case 2:
            inputData(person, numOfPeople);
            break;
            case 3:
            editData(numOfPeople, person);
            break;
            case 4:
            deleteSpecific(numOfPeople, person);
            break;
            case 5:
            displayDataByMonth(numOfPeople, person);
            break;
            case 6:
            displayDataByCity(numOfPeople, person);
            break;
            case 7:
            displayAll(numOfPeople, person);
            break;
            case 0:
            return;
            default:
            System.out.println("Error, You have entered an invalid option");
            }
        }
    }
}
