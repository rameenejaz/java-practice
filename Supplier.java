public class Supplier {
    private int ID;
    private String name;
    private String city;
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
    public String city() {
        return city;
    }
    
}
