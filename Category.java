//files used are //Category, Date2, Customer, Supplier, Item, Order, Report2, GroceryStoreSystem
public class Category {
    private int ID;
    private String name;
    private int quantityOrdered;
    public Category() {
        ID=0;
        name="";
        quantityOrdered=0;
    }
    public Category(String name) {
        this.name=name;
    }
    public Category(int ID, String name, int quantityOrdered) {
        this.ID=ID;
        this.name=name;
        this.quantityOrdered=quantityOrdered;
    }
    public Category(int ID, String name) {
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
    public int getQuantityOrdered () {
        return quantityOrdered;
    }
    public void setQtyOrdered(int quantityOrdered) {
        this.quantityOrdered=quantityOrdered;
    }
    public void addQtyToOrder(int qty) {
        this.quantityOrdered+=qty;
    }
    public String toString () {
        System.out.println("--------------------------------------------------------------------------------");
        return "ID: " + ID + " ,Name: " +name +" Quantity Ordered: " + quantityOrdered;
    }

}
