public class encapMarks {
    private double marks1;
    private double marks2;
    private double marks3;
    public encapMarks(double marks1, double marks2, double marks3) {
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    public double getMarks1 () {
        return marks1;
    }
    public double getMarks2 () {
        return marks2;
    }
    public double getMarks3 () {
        return marks3;
    }
    public void setMarks1 (double inputMarks1) {
        this.marks1=inputMarks1;
    }
    public void setMarks2 (double inputMarks2) {
        this.marks2=inputMarks2;
    }
    public void setMarks3 (double inputMarks3) {
        this.marks3=inputMarks3;
    }
    public void display() {
        System.out.println(" Marks 1:" + marks1 +", Marks 2:" + marks2+", Marks 3: "+marks3);
    }
    public static void main(String[] args) {
        encapMarks marks=new encapMarks(80.5,48,56.8);
        marks.setMarks1(17.5);
        marks.setMarks2(80.5);
        marks.setMarks3(98.4);
        marks.display();

    }
}
