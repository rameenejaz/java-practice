//files used are Date2, Customer, Item, Order, Category, and Main4
import java.util.ArrayList;
public class Order {
    private Customer customer;
    private int customerID;
    private Date2 orderdate;
    private ArrayList <Item> itemsList;
    private ArrayList <Integer> quantities;

    public Order(int customerID, Date2 orderDate, Customer customer) {
        this.customer=customer;
        this.customerID=customerID;
        this.orderdate=orderDate;
        this.itemsList=new ArrayList<>();
        this.quantities=new ArrayList<>();
        this.customer.addOrder(this);
    }
    public void addItem(Item item, int quantity) {
        if (quantity<=0 || quantity>item.getQtyInStock()) {
            System.out.println("Invalid quantity for item " + item.getName());
            return;
        }
        if (itemsList.contains(item)) {
            System.out.println("Item has already been added to cart!");
        }
        itemsList.add(item);
        quantities.add(quantity);
        item.reduceQuantity(quantity);
        item.getCategory().addQtyToOrder(quantity);
        double cost=quantity*item.getUnitPrice();
        // customer.totalOrderPrice(cost);
        if(item.getQtyInStock()<50) {
            System.out.println("Warning! Stock for " + item.getName() + " is less than 50!");
        }
    }
    public void viewOrder() {
        System.out.println("---------Items Ordered---------");
        for (int i=0; i<itemsList.size(); i++) {
            Item item=itemsList.get(i);
            int quantity=quantities.get(i);
            System.out.println(item.getName() + "--- Quantity: " + quantity + " ---- Unit Price: $" + item.getUnitPrice());

        }
    }
    public Customer getCustomer() {
        return customer;
    }
    public Date2 getOrderDate() {
        return orderdate;
    }
    public void setCustomer(Customer customer) {
        this.customer=customer;
    }
    public Date2 date () {
        return orderdate;
    }
    // public double calculateTotalPrice() {
    //     double total=0;
    //     for (int i=0; i<itemsList.size(); i++) {
    //         Item item=itemsList.get(i);
    //         int quantity=quantities.get(i);
    //         total=quantity*item.getUnitPrice();
    //     }
    //     return total;
    // }
    public void displayOrder() {
        System.out.println("Order Date: " + orderdate);
        for (int i=0; i<itemsList.size(); i++) {
            Item item=itemsList.get(i);
            int quantity=quantities.get(i);
            System.out.println("Item: " + item.getName() + " --- Quantity Ordered: " + quantity+ "--- Category: " + item.getCategory().getName() + "--- Price: " + item.getUnitPrice()*item.getQtyOrdered());
        }
    }
    public double getTotalPrice() {
        double total = 0;
        for (Item item : itemsList) {
            total += item.getUnitPrice() * item.getQtyOrdered();
        }
        return total;
    }
}
