public class Address {
    private int houseNumber;
    private String city;
    public Address() {
        houseNumber=-9;
        city="";
    }
    public Address(int houseNumber, String city) {
        this.houseNumber=houseNumber;
        this.city=city;
    }
    public int getHouseNumber () {
        return houseNumber;
    }
    public void setHouseNumber(int houseNumber){
        this.houseNumber=houseNumber;
    }
    public String city() {
        return city;
    }
    public void displayAddress() {
        System.out.println("City: " + city +" and House Number:" + getHouseNumber());
    }

}
