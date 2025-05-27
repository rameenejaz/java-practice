import java.util.ArrayList;

public class Report2 {
    public static void viewOrdersByDate(ArrayList<Order> orders, Date2 date) {
        for (Order o : orders) {
            Date2 orderDate=o.getOrderDate();
            if (o.getOrderDate().getDay() == date.getDay() && o.getOrderDate().getMonth() == date.getMonth() && o.getOrderDate().getYear() == date.getYear()) {
                o.displayOrder();
            }
        }
    }
    public static void listSuppliersByCity(ArrayList <Supplier> suppliers, String city) {
        bool found=false;
        for (Supplier s: suppliers) {
            if (s.getCity().equalsIgnoreCase(city)) {
                System.out.println("Suppliers: " + s.getName());    
                found=true;
            }
        }
        if(!found) {
            System.out.println("No suupliers found in " + city);
        }
    }
    
}
