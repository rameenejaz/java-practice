public class Supplier {
    private int ID;
    private String name;
    private String city;
    private String contact;

    public Supplier() {
        ID=0;
        name="";
        city="";
    }
    public Supplier(int ID, String name, String city) {
        this.ID=ID;
        this.name=name;
        this.city=city;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public Supplier(String name, String city, String contact) {
    this.name = name;
    this.city = city;
    this.contact = contact;
}
}
