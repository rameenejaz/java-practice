public class Student_1 extends Person1 {
    String status;
    public Student_1 () {
        super();
        status="";
    }
    public Student_1(String status) {
        super("","",0,"");
        this.status=status;
    }
    public Student_1(String name, String address, int phoneNumber, String email, String status) {
        super(name,address,phoneNumber,email);
        this.status=status;
    }
    public void display () {
        super.display();
        System.out.println("Status: " + status);
    }
}
