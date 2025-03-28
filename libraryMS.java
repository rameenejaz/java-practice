import java.util.Scanner;
public class libraryMS {
    public static void displayMenu() {
        System.out.println("1. To borrow book");
        System.out.println("2. To return book");
        System.out.println("3. To display library");
        System.out.println("0. To exit program");
        System.out.print("Choose one of the following between (1-3) or 0 to exit:");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Library lib=new Library(3);
        lib.addBook(new Book("Java how to code", "Kenneth"));
        lib.addBook(new Book("Harry Potter", "JK rowling"));
        lib.addBook(new Book("C++ book", "sharjeel"));
        int option=-99;
        while (option!=0) {
            displayMenu();
            if (input.hasNextInt()) {
                option = input.nextInt();
                input.nextLine(); // 🔥 Fix: Consume leftover newline
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // 🔥 Clear invalid input
                continue;
            }
            switch(option) {
                case 1:
                System.out.print("Enter book name: ");
                    String bookName = input.nextLine().trim();
                    while (bookName.isEmpty()) {
                        System.out.print("Book name cannot be empty. Enter again: ");
                        bookName = input.nextLine().trim();
                    }

                    System.out.print("Enter user ID: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Enter a valid User ID:");
                        input.next();
                    }
                    int ID = input.nextInt();
                    input.nextLine(); // 🔥 Fix: Consume leftover newline
                    
                    System.out.print("Enter your name: ");
                    String inputName = input.nextLine().trim();
                    while (inputName.isEmpty()) {
                        System.out.print("Name cannot be empty. Enter again: ");
                        inputName = input.nextLine().trim();
                    }

                    User user1 = new User(ID, inputName);
                    lib.borrowBook(bookName, user1);
                    break;

                case 2:
                System.out.print("Enter book name: ");
                    String bookName2 = input.nextLine().trim();
                    while (bookName2.isEmpty()) {
                        System.out.print("Book name cannot be empty. Enter again: ");
                        bookName2 = input.nextLine().trim();
                    }
                    
                    System.out.print("Enter user ID: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Enter a valid User ID:");
                        input.next();
                    }
                    int Id = input.nextInt();
                    input.nextLine(); // 🔥 Fix: Consume leftover newline
                    
                    System.out.print("Enter your name: ");
                    String inputName2 = input.nextLine().trim();
                    while (inputName2.isEmpty()) {
                        System.out.print("Name cannot be empty. Enter again: ");
                        inputName2 = input.nextLine().trim();
                    }

                    User user2 = new User(Id, inputName2);
                    lib.returnBook(bookName2, user2);
                    break;

                case 3:
                lib.displayLibrary();
                break;
                case 0:
                return;
            }
        }
        input.close();
    }
}