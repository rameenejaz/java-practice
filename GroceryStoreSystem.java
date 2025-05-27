import java.util.ArrayList;
import java.util.Scanner;
public class GroceryStoreSystem {
    static Scanner input= new Scanner(System.in);
    static ArrayList <Item> items= new ArrayList<>();
    static ArrayList<Order> orders= new ArrayList<>();
    static ArrayList<Category> categories=new ArrayList<>();
    static ArrayList<Customer> customers=new ArrayList<>();
    static ArrayList<Supplier> suppliers=new ArrayList<>();
    public static void displayMainMenu() {
        System.out.println("-----Grocery Store System-----");
        System.out.println("1. Manage Items");
        System.out.println("2. Manage Orders");
        System.out.println("3. Manage Categories");
        System.out.println("4. Manage Customers");
        System.out.println("5. Manage Supplier Information");
        System.out.println("0. To exit");
        System.out.println("------------------------------------");
        System.out.print("Choose one of the following options (1-5) or 0 to exit: ");
    }
    public static void manageItems() {
        System.out.println("-------Manage Items-------");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. View Items in Stock");
        System.out.println("--------------------------");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
            input.nextLine();
            System.out.print("Enter item name:");
            String name=input.nextLine();
            System.out.print("Enter item ID:");
            int itemID=input.nextInt();
            input.nextLine();
            System.out.print("Enter quantity in stock: ");
            int qty = input.nextInt();
            System.out.print("Enter unit price: ");
            double price = input.nextDouble();
            if (categories.isEmpty()) {
                System.out.println("No categories available. Please add a category first!");
                return;
            }
            System.out.println("Available Categories");
            for (Category c: categories) {
                System.out.println(c);
            }
            input.nextLine();
            System.out.println("Enter category name");
            String catName=input.nextLine();
            Category category= findCategoryByName(catName);

            break;
            case 2:
            System.out.println("Enter the ID of the item to remove ");
            int inputID=input.nextInt();
            boolean found=false;
            for (Item item: items) {
                if (inputID==items.getID()) {
                    items.remove();
                    System.out.println("Item removed!!");
                    found=true;
                    return;
                }
                else {
                     System.out.println("Invalid ID");
                }
            }
            break;
            case 3:
            for (Item item: items) {
                System.out.println(items);
            }
            break;
            default:
            System.out.println("Invalid Choice!");
        }
    }
    public static void manageOrders() {
        System.out.println("\n--- Manage Orders ---");
        System.out.println("1. Add/Place Order");
        System.out.println("2. View Orders");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
            if (customers.isEmpty() || items.isEmpty()) {
                 System.out.println("Please ensure at least one customer and item exist.");
                    return;
            }
            System.out.println("Enter the ID of the item");
        }
    }
    public static void main(String[] args) {
        int option=-99;
        while(option!=0){
            displayMainMenu();
            option=input.nextInt();
            input.nextLine();
            switch(option) {
                case 1:

                case 2:
                case 3:
                case 4:
                case 5:
                case 0:
                default:

            }
        }
    }
    public static Category findCategoryByName(String name) {
        for (Category c: categories) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
            return null;
        }
    }
    public static Customer findCustomerByID(int ID) {
        for (Customer c: customers) {
            if(c.getID()==ID) {
                return c;
            }
            return null;
        }
    }
    public static Item findItemByID(int ID) {
        for (Item i: items) {
            if (i.getID()== ID) {
                return i;
            }
            return null;
        }
    }

}