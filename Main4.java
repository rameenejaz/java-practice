//files used are Date2, Customer, Item, Order, Category, and Main
import java.util.Scanner;
import java.util.ArrayList;
public class Main4 {

    public static void displayMenu() {
        System.out.println("1. To add item");
        System.out.println("2. Edit items");
        System.out.println("3. View items");
        System.out.println("4. Place order");
        System.out.println("5. Edit Order");
        System.out.println("6. Delete Order");
        System.out.println("7. Add Customer");
        System.out.println("8. View Customers list");
        System.out.println("9. Remove a customer");
        System.out.println("10. View the list of customers");
        System.out.println("11. View items in stock");
        System.out.println("12. Show most item ordered");
        System.out.println("13. View items sold in specific month");
        System.out.println("14. View items sold between 2 months");
        System.out.println("15. View shopping cart");
        System.out.print("Choose one of the following options (1-15) or 0 to exit:");
    }

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);   
    int option=-99;
    while (option!=0) {
        displayMenu();
        option=input.nextInt();
        input.nextLine(); // to consume the leftover line
        switch(option!=0) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:

        }
    }

    }
}
