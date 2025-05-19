//files used are Date2, Customer, Item, Order, Category, and Main4
import java.util.ArrayList;
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
    public static void displayStarOfMonth(ArrayList<Order> orders) {
        Customer star=null;
        double max=0;
        for (int i=0; i<orders.size(); i++) {
            Orders o=orders.get(i);
            Customer c=o.getCustomer();
            if (o[i]>max) {
                max=c.getTotalOrderPrice();
                star=max;
            }
        }
        if (star!=null) {
            System.out.println("Star of the month: " + star.getName());
        }
        else {
            System.out.println("No orders were placed this month!");
        }
    }
}
