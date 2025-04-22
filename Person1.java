public class Person1 {
    private String name;
    private String address;
    private int phoneNumber;
    private String email;
    public Person1() {
        name="";
        address="";
        phoneNumber=0;
        email="";
    }
    public Person1(String name, String address, int phoneNumber, String email){
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    public void display () {
        System.out.println("Name: " +name + "Address:" + address + "Phone Number: " + phoneNumber + "Email: " + email);
    }
}

