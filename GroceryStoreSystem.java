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
        System.out.println("6. Display Star Customer of the Month");
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
            System.out.println("------Available Categories-------");
            for (Category c: categories) {
                System.out.println(c);
            }
            input.nextLine();
            System.out.println("Enter category name");
            String catName=input.nextLine();
            Category category= findCategoryByName(catName);
            if (category == null) {
            System.out.println("Category not found.");
            return;
            }
            items.add(new Item(itemID, name, qty, price, category));
            System.out.println("Item added successfully.");
            break;

            case 2:
                System.out.print("Enter the ID of the item to remove:");
                int inputID=input.nextInt();
                Item itemToRemove=findItemByID(inputID);
                if (itemToRemove!=null) {
                    items.remove(itemToRemove);
                    System.out.println("Item removed.");
                }
                    else {
                        System.out.println("Item not found");
                    }
                    break;
            case 3:
                for (Item item: items) {
                        System.out.println(item);
                }
                break;
            default:
                System.out.println("Invalid Choice!");
                }
        }
    public static void manageOrders() {
        System.out.println("-----------------------------------");
        System.out.println("\n--- Manage Orders ---");
        System.out.println("1. Add/Place Order");
        System.out.println("2. View Orders");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        System.out.println("-----------------------------------");
        switch (choice) {
            case 1:
                if (customers.isEmpty() || items.isEmpty()) {
                    System.out.println("Please ensure at least one customer and item exist.");
                        return;
                }
                System.out.println("Enter the ID of the item");
                for (Customer c: customers) {
                    System.out.println(c);
                }
                System.out.print("Enter customer ID: ");
                int custId = input.nextInt();
                Customer customer = findCustomerByID(custId);
                if (customer == null) {
                    System.out.println("Customer not found.");
                    return;
                    }
                System.out.println("Enter order date (dd month yyyy): ");
                System.out.print("Enter day:");
                int d=input.nextInt();
                input.nextLine();
                System.out.print("Enter month:");
                String m= input.nextLine();
                System.out.print("Enter year:");
                int y=input.nextInt();
                input.nextLine();   
                Date2 date=new Date2(d,m,y);
                Order order=new Order(custId, date, customer);
                order.setCustomer(customer);
                while(true) {
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("Available Items");
                    for (Item i: items) {
                        System.out.println(i);
                    }
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.print("Enter item ID to add (or -1 to exit): ");
                    int itemID=input.nextInt();
                    if (itemID==-1) {
                        break;
                    }
                    Item selectedItem=findItemByID(itemID);
                    if(selectedItem==null) {
                        System.out.println("Item not found");
                        continue;
                    }
                    System.out.print("Enter quantity:");
                    int qty=input.nextInt();
                    order.addItem(selectedItem, qty);
                    System.out.println(selectedItem.getName() + " added to cart!");
                }
                orders.add(order);
                System.out.println();
                System.out.println("Order placed successfully");
                System.out.println();
            break;
            case 2:
                for (Order o: orders) {
                    o.displayOrder();
                }
                break;
            default:
                System.out.println("Invalid Order!");
        }
    }
    static void manageCategories() {
        System.out.println("\n--- Manage Categories ---");
        System.out.println("1. Add Category");
        System.out.println("2. View Categories");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                input.nextLine();
                System.out.print("Enter category name: ");
                String name = input.nextLine();
                categories.add(new Category(name));
                System.out.println("Category added.");
                break;
            case 2:
                for (Category c : categories) {
                    System.out.println(c);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    static void manageCustomers() {
        System.out.println("\n--- Manage Customers ---");
        System.out.println("1. Add Customer");
        System.out.println("2. View All Customers");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                input.nextLine();
                System.out.print("Enter customer name: ");
                String name = input.nextLine();
                System.out.print("Enter address: ");
                String address = input.nextLine();
                System.out.print("Enter phone number: ");
                String phone = input.nextLine();
                System.out.print("Enter ID: ");
                int id = input.nextInt();
                customers.add(new Customer(name, address, phone, id));
                System.out.println("Customer added.");
                break;
            case 2:
                for (Customer c : customers) {
                    System.out.println(c);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    static void manageSuppliers() {
        System.out.println("\n--- Manage Suppliers ---");
        System.out.println("1. Add Supplier");
        System.out.println("2. View Suppliers");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                input.nextLine();
                System.out.print("Enter supplier name: ");
                String name = input.nextLine();
                System.out.print("Enter city: ");
                String city = input.nextLine();
                System.out.print("Enter contact: ");
                String contact = input.nextLine();
                suppliers.add(new Supplier(name, city, contact));
                System.out.println("Supplier added.");
                break;
            case 2:
                for (Supplier s : suppliers) {
                    System.out.println(s);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    static void addSampleData() {
       // Add sample categories
    categories.add(new Category("Beverages"));  // index 0
    categories.add(new Category("Snacks"));     // index 1
    categories.add(new Category("Dairy"));      // index 2
    categories.add(new Category("Produce"));    // index 3

    // Add sample items
    items.add(new Item(101, "Milk", 50, 3.5, categories.get(2)));        // Dairy
    items.add(new Item(102, "Chips", 100, 1.5, categories.get(1)));      // Snacks
    items.add(new Item(103, "Juice", 60, 2.0, categories.get(0)));       // Beverages
    items.add(new Item(104, "Apples", 80, 0.8, categories.get(3)));      // Produce
    items.add(new Item(105, "Cheese", 40, 4.0, categories.get(2)));      // Dairy
    items.add(new Item(106, "Biscuits", 90, 1.2, categories.get(1)));    // Snacks
    items.add(new Item(107, "Yogurt", 30, 2.5, categories.get(2)));      // Dairy
    items.add(new Item(108, "Bananas", 100, 0.6, categories.get(3)));    // Produce

    // Add sample customers
    customers.add(new Customer("Ali", "Lahore", "03001234567", 201));
    customers.add(new Customer("Sara", "Karachi", "03007654321", 202));
    customers.add(new Customer("Zainab", "Islamabad", "03009876543", 203));
    customers.add(new Customer("Usman", "Faisalabad", "03001112222", 204));
    customers.add(new Customer("Fatima", "Multan", "03005556666", 205));

    // Add sample suppliers
    suppliers.add(new Supplier(100,"ABC Traders", "Lahore", "042-1234567"));
    suppliers.add(new Supplier(200, "XYZ Wholesalers", "Karachi", "021-7654321"));
    suppliers.add(new Supplier(300,"FreshFarms Ltd.", "Islamabad", "051-7894561"));
    }
    public static void main(String[] args) {
        addSampleData();
        int option=-99;
        while(option!=0){
            displayMainMenu();
            option=input.nextInt();
            input.nextLine();
            switch(option) {
                case 1:
                manageItems(); 
                break;
                case 2:
                manageOrders();
                break;
                case 3:
                manageCategories();
                break;
                case 4:
                manageCustomers();
                break;
                case 5:
                manageSuppliers();
                break;
                case 6:
                Customer.displayStarOfMonth(orders); // pass your actual orders list
                break;
                case 0:
                System.out.println("Exiting the program!");
                break;
                default:
                System.out.println("Invalid choice. Try again!");
            }
        }
    }
    public static Category findCategoryByName(String name) {
        for (Category c: categories) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }
    public static Customer findCustomerByID(int ID) {
        for (Customer c: customers) {
            if(c.getID()==ID) {
                return c;
            }
        }
        return null;
    }
    public static Item findItemByID(int ID) {
        for (Item i: items) {
            if (i.getID()== ID) {
                return i;
            }
        }
        return null;
    }
}