public class Person2 {
    private String name;
    private Address1 address;
    public Person2() {
        name="";
        address=new Address1();
    }
    public Person2 (String name, Address address) {
        this.name=name;
        // this.address=address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public Address1 getaddress () {
        return address();
    }
    public void setAddress(Address1 address1) {
        this.address=address1;
    }
    public void display () {
        System.out.println("Name: " +name);
        System.out.println("City:" + address.getCity());
        System.out.println("Country:" + address.getCountry());
        System.out.println("Street Name:" + address.getStreetName());
        System.out.println("House Number: " + address.getHouseNum());
    }
}
