public class Student extends User {
    private String studentID;
    public Student (String Name, int ID, String studID) {
        super(ID,Name);
        this.studentID=studID;
    }
    public String getStudentID() {
        return studentID;
    }
}