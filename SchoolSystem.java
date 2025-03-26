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

    public Person() {
        ID = 0;
        name = "";
        dob = new DOB();
    }
    public Person(int id, String name1, DOB d) {
        ID = id;
        name = name1;
        dob = new DOB(d.day, d.month, d.year);
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Date of Birth: " + dob.day + "/" + dob.month + "/" + dob.year);
    }
}
class Student {
    private int ID;
    private String name;
    private DOB dob;
    private String program;
    public Student() {
        ID = 0;
        name = "";
        dob = new DOB();
        program = "";
    }

    public Student(int id, String name1, DOB d, String p) {
        ID = id;
        name = name1;
        dob = new DOB(d.day, d.month, d.year);
        program = p;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Date of Birth: " + dob.day + "/" + dob.month + "/" + dob.year);
        System.out.println("Program: " + program);
    }
}

class Teacher {
    private int ID;
    private String name;
    private DOB dob;
    private int salary;

    public Teacher() {
        ID = 0;
        name = "";
        dob = new DOB();
        salary = 0;
    }

    public Teacher(int id, String name1, DOB d, int salary1) {
        ID = id;
        name = name1;
        dob = new DOB(d.day, d.month, d.year);
        salary = salary1;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Date of Birth: " + dob.day + "/" + dob.month + "/" + dob.year);
        System.out.println("Salary: " + salary);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = null;
        Teacher teacher = null;

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
                    System.out.println("Enter Teacher ID: ");
                    int tID = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.println("Enter Teacher Name: ");
                    String tName = scanner.nextLine();

                    System.out.println("Enter Teacher DOB (day month year): ");
                    int tDay = scanner.nextInt();
                    int tMonth = scanner.nextInt();
                    int tYear = scanner.nextInt();

                    System.out.println("Enter Salary: ");
                    int tSalary = scanner.nextInt();

                    teacher = new Teacher(tID, tName, new DOB(tDay, tMonth, tYear), tSalary);
                    System.out.println("Teacher data saved successfully.");
                    break;

                case 2:
                    System.out.println("Enter Student ID: ");
                    int sID = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.println("Enter Student Name: ");
                    String sName = scanner.nextLine();

                    System.out.println("Enter Student DOB (day month year): ");
                    int sDay = scanner.nextInt();
                    int sMonth = scanner.nextInt();
                    int sYear = scanner.nextInt();

                    scanner.nextLine(); 
                    System.out.println("Enter Program: ");
                    String sProgram = scanner.nextLine();

                    student = new Student(sID, sName, new DOB(sDay, sMonth, sYear), sProgram);
                    System.out.println("Student data saved successfully.");
                    break;
                case 3:
                    if (teacher = null) {
                        teacher.display();
                    } else {
                        System.out.println("No teacher data available.");
                    }
                    break;
                case 4:
                    if (student != null) {
                        student.display();
                    } else {
                        System.out.println("No student data available.");
                    }
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
