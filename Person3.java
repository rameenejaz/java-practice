//files used are Person3, DOB3, Student3 and Address3 and Main3
public class Person3 {
    private String name;
    private int ID;
    private Address3 address;
    private DOB2 dob;
    private Student3 student;
    public Person3() {
        name="";
        ID=0;
        dob=new DOB2();
        address=new Address3();
    }
    public Person3 (String name, int ID ,DOB2 dob, Address3 address) {
        this.name=name;
        this.ID=ID;
        this.dob=dob;
        this.address=address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void getID(int ID) {
        this.ID=ID;
    }
    public int setID() {
        return ID;
    }
    public Address3 getaddress () {
        return address;
    }
    public void setAddress(Address3 address) {
        this.address=address;
    }
    public void display () {
        System.out.println("Name: " +name);
        address.displayAddress();
        dob.displayDOB();
    }
    public Person3(String name, Address3 address) {

    }
}
