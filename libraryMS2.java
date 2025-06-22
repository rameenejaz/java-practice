import java.util.Scanner;
public class User {
    private int userID;
    private String name;
    public User() {
        userID=0;
        name="";
    }
    public User(int ID, String Name) {
        this.userID=ID;
        this.name=Name;

    }
    public String getName () {
        return name;
    }
    public int getID () {
        return userID;
    }
    
}
public class Student extends User {
    private String studentID;
    public Student (String Name, int ID, String studID) {
        super(ID,Name);
        this.studentID=studID;
    }
    public string getStudentID() {
        return studentID;
    }
}
public class Teacher extends User {
    String teacherID;
    public Teacher (String name, int ID, String teachID) {
        super(ID,Name);
        teacherID=teachID;
    }
    // public void display() {
    //     System.out.println("Teacher Name:" + Name + "Teacher ID: " + teacherID);
    // }
    public String getTeacherID () {
        return teacherID;
    }
}
public class Book {
    private String title;
    private String author;
    private boolean isBorrowed=false;
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    public Book(String title1, String title2 ) {
        this.title=title1;
        this.title=title2;
    }
    public void borrowBook() {
        if(!isBorrowed) {
            isBorrowed=true;
            System.out.println(title +" has been borrowed.");
        }
        else {
            System.out.println(title +" has already been borrowed.");
        }
    }
    public void returnBook() {
        if(isBorrowed) {
            isBorrowed=false;
            System.out.println(title +" has been returned");
        }
        else {
            System.out.println(title +" was not borrowed");
        }
    }
}
public class Library {
    private Book [] books;
    private int counter;
    public Library(int size){
        books=new Book[10];
        counter=0;
    }
    public void addBook(Book book) {
        if (counter<books.length) {
            books[counter]=book;
            counter++;
            System.out.println(book.getTitle() + " has been added to library");
        }
        else {
            System.out.println("Library is full, books cannot be added!");
        }
    }
    public void borrowBook(String book, User user) {
        for (int i=0; i<counter; i++) {
            if(books[i].getTitle().equals(book) && !books[i].isBorrowed()) {
                books[i].borrowBook();
                return;
            }
            else {
                System.out.println("Book not available for borrowing.");
            }
        }
    }
    public void returnBook(String title, User user) {
        for (int i=0; i<counter; i++) {
            if(books[i].getTitle().equals(book) && !books[i].isBorrowed()) {
                books[i].returnBook();
                return;
            }
            else {
                System.out.println("No book with this title to borrowed");
            }
        }
    }
}
public class libraryMS2 {
    public static void displayMenu() {
        System.out.println("1. To borrow book");
        System.out.println("2. To return book");
        System.out.println("3. To display library");
        System.out.println("4. To exit program");
        System.out.print("Choose one of the following between (1-4) or 0 to exit:");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Library lib=new Library();
        int option=-99;
        while (option!=0) {
            displayMenu();
            option=input.nextInt();
            switch(option) {
                case 1:
                System.out.print("Enter name of the book:");
                String bookName=input.nextLine();
                System.out.print("Enter userID:");
                int ID=input.nextInt();
                System.out.print("Enter Name:");
                String inputName=input.nextLine();
                lib.borrowBook(bookName, userID,inputName);
                break;
                case 2:
                System.out.print("Enter name of the book:");
                String bookName2=input.nextLine();
                System.out.print("Enter userID:");
                int Id=input.nextInt();
                System.out.print("Enter Name:");
                String inputName2=input.nextLine();
                lib.returnBook(bookName2, Id,inputName2);
                break;
                // case 3:
                // break;
                case 0:
                return;
            }
        }
    }
}
