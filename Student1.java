import java.util.Scanner;
public class Student1 {
    private int studentID;
    private String name;
    private String [] enrolledCourses;
    private int enrolledCount;
    public Student1 () {
        studentID=0;
        name="";
        enrolledCourses=new String[5];
        enrolledCount=0;
    }
    public Student1 (int studID, String studName, int count) {
        this.studentID=studID;
        this.name=studName;
        this.enrolledCount=count;
        this.enrolledCourses=new String[5];
    }
    public void enrollCourses(String courseName) {
        if (enrolledCount>=enrolledCourses.length) {
            System.out.println(name + " no more courses can be registered, limit reached!");
            return;
        }
        for (int i=0; i<enrolledCount; i++) {
            if (enrolledCourses[i].equals(courseName)) {
                System.out.println(name +" has already been enrolled in " + courseName);
                return;
            }
        }
        enrolledCourses[enrolledCount]=courseName;
        enrolledCount++;
        System.out.println();
        System.out.println(name + " has successfully enrolled in " + courseName);
    }
    public void dropCourse (String courseName) {
        if (enrolledCount<=0) {
            System.out.println(name +" does not take " + courseName);
            return;
        }
        boolean found=false;
        for (int i=0; i<enrolledCount; i++) {
            if(enrolledCourses[i].equals(courseName)) {
                System.out.println("Removing " + courseName + " from " + name + "'s registered courses");
                found=true;
                // to move elements to the left
                for (int j=i; j<(enrolledCount-1); j++ ) {
                    enrolledCourses[j]=enrolledCourses[j+1];
                }
                enrolledCourses[enrolledCount-1]=null;
                enrolledCount--;
                System.out.println(name + " has successfully removed " + courseName);
                return;
            }
        }
        if (!found) {
            System.out.println(name + " is not enrolled in " + courseName);
        }
    }
    public void displayCourses() {
        if (enrolledCount==0) {
            System.out.println(name + " did not register any courses");
        }
        else {
            System.out.println(name + " registered in the following courses:");
            System.out.println("\n----------------------------------\n");
            for (int i=0; i<enrolledCount; i++) {
                System.out.print(enrolledCourses[i] + " ");
                System.out.println();
            }
            System.out.println("\n---------------------------------\n");
        }
    }
    public void displayMenu() {
        System.out.println("--------------------------------------");
        System.out.println("      COURSE ENROLLMENT SYSTEM        ");
        System.out.println("\n1. To add a course\n");
        System.out.println("\n2. To drop a course\n");
        System.out.println("\n3. To display list of courses\n");
        System.out.println("--------------------------------------");
        System.out.print("\nChoose from the following options (1-3) or 0 to exit:");
    }
    public static void main(String[] args) {
        // Student1 student=new Student1();
        Scanner input=new Scanner(System.in);
        int option=-99;
        int ID=0;
        String name1="";
        System.out.print("Enter your student ID:");
            ID=input.nextInt();
            input.nextLine();
            System.out.print("Enter your name:");
            name1=input.nextLine();
            Student1 students=new Student1(ID, name1,0);
            // student(ID, name1);
        while (option!=0) {
            students.displayMenu();
            option=input.nextInt();
            switch(option) {
                case 1:
                input.nextLine();
                System.out.print("\nEnter name of the course you want to enroll in:");
                String inputCourseEnrollName=input.nextLine();
                students.enrollCourses(inputCourseEnrollName);
                System.out.println("DONE COURSE ENROLLED");
                break;

                case 2:
                System.out.print("\nEnter name of the course you want to drop:");
                input.nextLine();
                String inputCourseDropName=input.nextLine();
                students.dropCourse(inputCourseDropName);
                break;

                case 3:
                students.displayCourses();
                break;

                case 0:
                System.out.println("\nEXITING THE PROGRAM!");
                break;

                default:
                System.out.println("invalid input");
            }
        }
        input.close();
    }
}

