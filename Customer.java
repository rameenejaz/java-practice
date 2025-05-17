//files used are Date2, Customer, Item, Order, Category, and Main4

public class Customer {
    private int ID;
    private String name;
    private double totalOrderPrice;
    public Customer() {
        ID=0;
        name="";
        totalOrderPrice=0;
    }
    public Customer(int ID, String name, double totalOrderPrice) {
        this.ID=ID;
        this.name=name;
        this.totalOrderPrice =totalOrderPrice ;
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
    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }
    public double addToTotalPrice(double price) {
        totalOrderPrice+=price;
        return totalOrderPrice;
    }
    //function for the star of the month

}
