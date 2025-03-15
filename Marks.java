import java.util.Scanner;
public class Marks {
    private int marks1;
    private int marks2;
    private int marks3;
    private int sum;
    Marks() {
        marks1=0;
        marks2=0;
        marks3=0;
        sum=0;
    }
    Marks(int inMarks1, int inMarks2, int inMarks3) {
        marks1=inMarks1;
        marks2=inMarks2;
        marks3=inMarks3;
        sum = marks1+marks2+marks3;
    }
    public int sumMarks() {
        return sum;
    }
    public void display () {
        System.out.printf("The initial values are marks 1:%d\n", marks1 );
        System.out.printf("The initial values are marks 2: %d\n", marks2 );
        System.out.printf("The initial values are marks 3: %d\n", marks3 );
        System.out.printf("The sum is:%d\n", sumMarks());
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\nThe default values: \n");
        Marks objectMarks=new Marks();
        objectMarks.display();
        System.out.println("Adding custom marks!");
        System.out.println("Enter marks 1:");
        int marks1=input.nextInt();
        System.out.println("Enter marks 2:");
        int marks2=input.nextInt();
        System.out.println("Enter marks 3:");
        int marks3=input.nextInt();
        Marks objectMarks2=new Marks(marks1, marks2, marks3);
        objectMarks2.display();
    }
}
