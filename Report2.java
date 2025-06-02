import java.util.ArrayList;
public class Report2 {
    public static void viewOrdersByDate(ArrayList<Order> orders, Date2 date) {
        boolean found=false;
        for (Order o : orders) {
            Date2 orderDate=o.getOrderDate();
            if (o.getOrderDate().getDay() == date.getDay() && o.getOrderDate().getMonth() == date.getMonth() && o.getOrderDate().getYear() == date.getYear()) {
                o.displayOrder(); //only if order found
                found=true;
            }
        }
            if (!found) {
                System.out.println("No orders on this date");
            }
    }
    public static void listSuppliersByCity(ArrayList <Supplier> suppliers, String city) {
        boolean found2=false;
        for (Supplier s: suppliers) {
            if (s.getCity().equalsIgnoreCase(city)) {
                System.out.println(s);
                found2=true;
            }
        }
        if(!found2) {
            System.out.println("No suupliers found in " + city);
        }
    }
}
