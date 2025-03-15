public class Marks {
    private int marks1;
    private int marks2;
    private int marks3;
    Marks() {
        marks1=0;
        marks2=0;
        marks3=0;
    }
    Marks(int inMarks1, int inMarks2, int inMarks3) {
        marks1=inMarks1;
        marks2=inMarks2;
        marks3=inMarks3;
    }
    public static void main(String[] args) {
        Marks marks=new Marks();
    }
}
