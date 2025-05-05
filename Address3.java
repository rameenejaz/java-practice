public class Address3 {
    private String city;
    private int houseNumber;
    private String society;
    public Address3 () {
        city="";
        houseNumber=0;
        society="";
    }
    public Address3(String city, int houseNumber, String society) {
        this.city=city;
        this.houseNumber=houseNumber;
        this.society=society;
    }
    public String getCity() {
        return city;
    }
    public int getHouseNumber() {
        return houseNumber;
    }
    public String getSociety() {
        return society;
    }
    public void setCity(String city) {
        this.city=city;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber=houseNumber;
    }
    public void setSociety(String society) {
        this.society=society;
    }
    public void displayAddress() {
        System.out.println("City:" + getCity());
        System.out.println("HouseNumber:" +getHouseNumber());
        System.out.println("Society:" +getSociety());
    }
}
