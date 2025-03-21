public class encapStudent {
    private String name;
    private int [] Result_array;
    public encapStudent () {
        name="";
        Result_array=new int [5];
    }
    public encapStudent(String name1, int [] result1) {
        this.name=name1;
        this.Result_array=result1;
    }
    public double average() {
        double sum=0;
        for (int marks:Result_array) {
            sum+=marks;
        }
        return sum/5;
    }
    public String getName () {
        return name;
    }
    public int [] getResultArray () {
        return Result_array;
    }
    public void display() {
        System.out.print("Name: " + name + ", Marks: ");
        for (int mark : Result_array) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage: " + average());
    }

    public static void main(String[] args) {
        encapStudent student1= new encapStudent();
        int marks1[]={1,2,3,4,5};
        encapStudent student2= new encapStudent("Rameen", marks1);
        student2.display();
        int marks2[]={10,20,30,40,50};
        encapStudent student3=new encapStudent("Hamza", marks2);
        student3.display();
        double avg2=student2.average();
        double avg3=student3.average();
        if(avg3>avg2) {
            System.out.println("Average of student 2 is greater than 3");
        }
        else if(avg2<avg3) {
            System.out.println("Average of student 3 is greater than 2");
        }
        else {
            System.out.println("Both have same averages");
        }
        encapStudent student4=new encapStudent(student2.getName(), student3.getResultArray());
        System.out.println("\nDetails of Third Student (Hybrid of Student1 & Student2):");
        student3.display();
    }
}
