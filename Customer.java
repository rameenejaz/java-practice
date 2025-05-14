//files used are Date2, Customer, Item, Order, Category, and Main4

public class Customer {
    private int ID;
    private String name;
    public Customer() {
        ID=0;
        name="";
    }
    public Customer(int ID, String name) {
        this.ID=ID;
        this.name=name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID=ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

}
