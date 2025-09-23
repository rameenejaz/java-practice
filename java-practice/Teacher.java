public class Teacher extends User {
    String teacherID;
    public Teacher (String name, int ID, String teachID) {
        super(ID,Name);
        teacherID=teachID;
    }
    // public void display() {
    //     System.out.println("Teacher Name:" + Name + "Teacher ID: " + teacherID);
    // }
    public String getTeacherID () {
        return teacherID;
    }
}