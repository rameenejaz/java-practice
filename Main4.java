import java.util.Scanner;

public class Main4 {
    static Library library = new Library();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initializeSampleData();

        int mainChoice;
        do {
            System.out.println("\n========== Welcome to the Library ==========");
            System.out.println("Select User Role:");
            System.out.println("1. Librarian");
            System.out.println("2. Member");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            mainChoice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (mainChoice) {
                case 1:
                    librarianMenu();
                    break;
                case 2:
                    memberMenu();
                    break;
                case 0:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
            }
        } while (mainChoice != 0);

        sc.close();
    }

    static void initializeSampleData() {
        library.addBook(new Book("B101", "Java Basics", "John Doe"));
        library.addBook(new Book("B102", "Data Structures", "Alice Smith"));
        library.addMember(new ExecutiveMember("Ali", "Lahore"));
        library.addMember(new JournalMember("Sara", "Islamabad"));
    }

    static void librarianMenu() {
        int choice;
        do {
            System.out.println("\n--- Librarian Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Issue Book to Member");
            System.out.println("4. Return Book from Member");
            System.out.println("5. View Member Fine");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addBook(); break;
                case 2: viewAllBooks(); break;
                case 3: issueBookToMember(); break;
                case 4: returnBookFromMember(); break;
                case 5: viewMemberFine(); break;
                case 0: System.out.println("Returning to main menu..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    static void memberMenu() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        Member m = library.findMember(name);

        if (m == null) {
            System.out.println("Member not found.");
            return;
        }

        int choice;
        do {
            System.out.println("\n--- Member Menu ---");
            System.out.println("1. Search Book");
            System.out.println("2. View Borrowing History");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: searchBook(); break;
                case 2: m.showHistory(); break;
                case 0: System.out.println("Returning to main menu..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    // ---------- Librarian Methods ----------

    static void addBook() {
        System.out.print("Enter Book ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        library.addBook(new Book(id, title, author));
        System.out.println("Book added.");
    }

    static void viewAllBooks() {
        System.out.println("All Books:");
        for (Book b : library.getBooks()) {
            System.out.println(b);
        }
    }

    static void issueBookToMember() {
        System.out.print("Enter Member Name: ");
        String name = sc.nextLine();
        Member m = library.findMember(name);
        if (m != null) {
            System.out.print("Enter Book ID: ");
            String bookId = sc.nextLine();
            library.issueBook(bookId, m);
        } else {
            System.out.println("Member not found.");
        }
    }

    static void returnBookFromMember() {
        System.out.print("Enter Member Name: ");
        String name = sc.nextLine();
        Member m = library.findMember(name);
        if (m != null) {
            System.out.print("Enter Book ID: ");
            String bookId = sc.nextLine();
            library.returnBook(bookId, m);
        } else {
            System.out.println("Member not found.");
        }
    }

    static void viewMemberFine() {
        System.out.print("Enter Member Name: ");
        String name = sc.nextLine();
        Member m = library.findMember(name);
        if (m != null) {
            boolean hasFine = false;
            for (Transaction t : m.getTransactions()) {
                if (t.getDaysOverdue() > 0) {
                    hasFine = true;
                    int fine = (int) (t.getDaysOverdue() * m.getFinePerDay());
                    System.out.println("Book: " + t.getBook().getTitle());
                    System.out.println("Fine: Rs. " + fine + " | Sent to: " + m.getAddress());
                }
            }
            if (!hasFine) System.out.println("No overdue fines.");
        } else {
            System.out.println("Member not found.");
        }
    }

    // ---------- Member Methods ----------

    static void searchBook() {
        System.out.print("Enter title keyword: ");
        String keyword = sc.nextLine();
        library.searchBook(keyword);
    }
}
