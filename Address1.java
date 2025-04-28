public class Address1 {
    private String city;
    private String country;
    private String streetName;
    private int houseNumber;
    public Address1 () {
        city="";
        country="";
        streetName="";
        houseNumber=0;
    }
    public Address1(String city, String country, String streetName, int houseNumber) {
        this.city=city;
        this.country=country;
        this.streetName=streetName;
        this.houseNumber=houseNumber;
    }
    public String getCity() {
        return city; 
    }
    public void setCity(String city) {
        this.city=city;
    }
    public String getCountry() {
        return country; 
    }
    public void setCountry(String country) {
        this.country=country;
    }
    public String getStreetName() {
        return streetName; 
    }
    public void setStreetName(String streetName) {
        this.streetName=streetName;
    }
    public int getHouseNum() {
        return houseNumber; 
    }
    public void setHouseNum(int houseNumber) {
        this.houseNumber=houseNumber;
    }

}
