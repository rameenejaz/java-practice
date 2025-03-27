import java.util.Scanner;
public class libraryMS {
    public static void displayMenu() {
        System.out.println("1. To borrow book");
        System.out.println("2. To return book");
        System.out.println("3. To display library");
        System.out.println("4. To exit program");
        System.out.print("Choose one of the following between (1-4) or 0 to exit:");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Library lib=new Library(3);
        int option=-99;
        while (option!=0) {
            displayMenu();
            option=input.nextInt();
            switch(option) {
                case 1:
                System.out.print("Enter userID:");
                int ID=input.nextInt();
                System.out.println();
                System.out.print("Enter name of the book:");
                String bookName=input.nextLine();
                System.out.println();
                System.out.print("Enter Name:");
                String inputName=input.nextLine();
                System.out.println();
                User user1=new User(ID, inputName);
                lib.borrowBook(bookName,user1);
                break;
                case 2:
                System.out.print("Enter userID:");
                int Id=input.nextInt();
                System.out.println();
                System.out.print("Enter name of the book:");
                String bookName2=input.nextLine();
                System.out.println();
                System.out.print("Enter Name:");
                String inputName2=input.nextLine();
                User user2=new User(Id, inputName2);
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