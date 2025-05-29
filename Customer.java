//files used are Date2, Customer, Item, Order, Category, and Main4
import java.util.ArrayList;
public class Customer {
    private int ID;
    private String name;
    private double totalOrderPrice;
    private String address;
    private String phone;
    private ArrayList<Order> orders;
    public Customer() {
        ID=0;
        name="";
        totalOrderPrice=0;
        orders=new ArrayList<>();
    }
    public Customer(int ID, String name,String address, String phone, double totalOrderPrice) {
        this.ID=ID;
        this.name=name;
        this.totalOrderPrice =totalOrderPrice ;
        this.address = address;
        this.phone = phone;
        this.orders=new ArrayList<>();
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
    // public double addToTotalPrice(double price) {
    //     totalOrderPrice+=price;
    //     return totalOrderPrice;
    // }
    //function for the star of the month
    public static void displayStarOfMonth(ArrayList<Order> orders) {
        Customer star=null;
        double max=0;
        for (Order o: orders) {
            Customer c =o.getCustomer();
            if (c.getTotalOrderPrice()>max) {
                max=c.totalOrderPrice();
                star=c;
            }
        }
        if (star!=null) {
            System.out.println("Star of the month: " + star.getName());
        }
        else {
            System.out.println("No orders were placed this month!");
        }
    }
    public Customer(String name, String address, String phone, int ID) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.ID = ID;
    this.orders=new ArrayList<>();
}
    public double totalOrderPrice() {
        double total = 0;
        for (Order o : orders) {
            total += o.getTotalPrice();
        }
        return total;
    }
    public void addOrder(Order order) {
            orders.add(order);
        }
    public ArrayList<Order> getOrders() {
        return orders;
    }
    @Override
    public String toString() {
            return "Customer ID: " + ID + ", Name:" + name + ", Address: " + address +
            " ,Phone: " + phone + ",Total Order Price: $" + totalOrderPrice;
        }
}
