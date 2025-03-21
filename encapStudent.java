public class encapStudent {
    private String name;
    private int [] Result_array;
    public encapStudent () {
        name=" ";
        Result_array=0;
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
    public void display () {
        System.out.println("Name" + name+", Marks: ");
        for(int mark: Result_array) {
            System.out.print(mark+ " ");
        }
        System.out.println("Average:", average());
    }

    public static void main(String[] args) {
        encapStudent student1= new encapStudent();
        int marks1[]={1,2,3,4,5};
        encapStudent student2= new encapStudent("Rameen", marks1);
        student2.display();

    }
}
