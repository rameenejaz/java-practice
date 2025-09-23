import java.util.Scanner;
class DOB {
    private int day;
    private int month;
    private int year;

    public DOB() {
        day = 0;
        month = 0;
        year = 0;
    }

    public DOB(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
}
class Person {
    int ID;
    String name;
    DOB dob; 

    public Person(int ID, String name, DOB dob) {
        ID = ID;
        name = name;
        dob = dob;
    }
}

public class Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner initialized properly

        while (true) {
            System.out.println("Press one of the following options (1-4 or 0 to exit):");
            System.out.println("1. Get teacher data");
            System.out.println("2. Get student data");
            System.out.println("3. Display teacher data");
            System.out.println("4. Display student data");
            System.out.println("0. Exit");

            int option = scanner.nextInt(); 

            switch (option) { /
                case 1:
                    System.out.println("Getting teacher data...");
                    
                    break;
                case 2:
                    System.out.println("Getting student data...");
                    
                    break;
                case 3:
                    System.out.println("Displaying teacher data...");
                    
                    break;
                case 4:
                    System.out.println("Displaying student data...");
                    
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
