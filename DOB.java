import java.util.Scanner;
class DOB {
    public int day;
    public int month;
    public int year;

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
    private int ID;
    private String name;
    DOB dob; 
    Person() {
        ID=0;
        name="";
    }
    Person(int id, String name1) {
        ID=id;
        name=name1;
    }
    public void display () {
        System.out.println("Name" +name);
        System.out.println("ID" +name);
        System.out.println("Date of Birth" + dob.day +"/" + dob.month + "/" + dob.year);
    }
    
}
class Student extends Person {
    private String program;
    public Student () {
        program="";
    }
    public Student(int p) {
        program=p;
    }
    @Override
    void public display () {
        System.out.println(" Program " + program);
    }

}
class Teacher extends Person {
    int salary;
    Teacher () {
        salary=0;
    }
    @Override
    void public display () {
        System.out.println(" Salary: " + salary);
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

            switch (option) { 
                case 1:
                    System.out.println("Getting teacher data.");
                    
                    break;
                case 2:
                    System.out.println("Getting student data.");
                    
                    break;
                case 3:
                    System.out.println("Displaying teacher data.");
                    
                    break;
                case 4:
                    System.out.println("Displaying student data.");
                    
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}



































































// import java.util.Scanner;
// public class DOB {
//     private int day;
//     private int month;
//     private int year;
//     public DOB() {
//         day=0;
//         month=0;
//         year=0;
//     }
//     public DOB(int d, int m, int y) {
//         day=d;
//         month=m;
//         year=y;
//     }
// }
// public class Person {
//     int ID;
//     String name;
// }
// public class management {
//     public static void main(String[] args) {
//         while(true) {
//             System.out.println("Press one of the following options (1-4 or 0 to exit):");
//             System.out.println("1.Get teacher data");
//             System.out.println("2.Get student data");
//             System.out.println("3.Display teacher data");
//             System.out.println("1.Display student data");
//             System.out.println("0:To exit");
//             System.out.println("Press one of the following options (1-4 or 0 to exit):");
//             int option=0;
//             option = scanner.nextInt();
//             switch (choice) {
//                 case 1:
//                     break;
//                 case 2:
//                     break;
//                 case 3:
                    
//                     break;
//                 case 4:
//                     break;
//                 case 0:
//                     System.out.println("Exiting program...");
//                     return;
//             }
//             }
//     }
// }
