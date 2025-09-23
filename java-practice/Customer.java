//files used are Category, Date2, Customer, Supplier, Item, Order, Report2, GroceryStoreSystem
import java.util.ArrayList;
import java.util.Scanner;
public class Customer {
    private int ID;
    private String name;
    // private double totalOrderPrice;
    private String address;
    private String phone;
    private ArrayList<Order> orders;
    static Scanner input= new Scanner(System.in);
    public Customer() {
        ID=0;
        name="";
        // totalOrderPrice=0;
        orders=new ArrayList<>();
    }
    public double totalOrderPrice() {
        double total = 0;
        for (Order o : orders) {
            total += o.getTotalPrice();
        }
        return total;
    }
    public Customer(int ID, String name,String address, String phone, double totalOrderPrice) {
        this.ID=ID;
        this.name=name;
        // this.totalOrderPrice =totalOrderPrice ;
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
    // public double addToTotalPrice(double price) {
    //     totalOrderPrice+=price;
    //     return totalOrderPrice;
    // }
    //function for the star of the month
   public static void displayStarOfMonth(ArrayList<Customer> customers) {
    System.out.print("Enter the month (as a word, e.g., January): ");
    String month = input.nextLine().trim().toLowerCase();
    System.out.print("Enter the year: ");
    int year = input.nextInt();
    input.nextLine();

    Customer star = null;
    double maxTotal = 0;

    for (Customer c : customers) {
        double totalThisMonth = 0;
        for (Order o : c.getOrders()) {
            Date2 d = o.getDate();  // make sure Order class has getDate() method
            if (d.getMonth().trim().toLowerCase().equals(month) && d.getYear() == year) {
                totalThisMonth += o.getTotalPrice();
            }
        }
        if (totalThisMonth > maxTotal) {
            maxTotal = totalThisMonth;
            star = c;
        }
    }

    if (star != null) {
        System.out.println("🌟 Star of the month (" + month + " " + year + "): " + star.getName());
        System.out.println("Total spent: $" + maxTotal);
    } else {
        System.out.println("No orders were placed in " + month + " " + year + ".");
    }
}


    public Customer(String name, String address, String phone, int ID) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.ID = ID;
    this.orders=new ArrayList<>();
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
            " ,Phone: " + phone + ",Total Order Price: $" + totalOrderPrice();
        }
}
