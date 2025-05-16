//using files book3 and bookStore

import java.util.Scanner;

public class BookStore {
    Book3 book1=new Book3("Java how to code", "Pearson", "John");
    Book3 book2=new Book3("Harry Potter", "UK Print Press", "JK Rowling");
    Book3 book3=new Book3("Die for me", "China Town", "Rameen");
    Book3 book4=new Book3("History of Pakistan", "Pakistan Gov", "Army");
    Book3 book5=new Book3("Geography", "ABC school", "Mr dani");

    public void displayAll() {
        book1.displayBooks();
        book2.displayBooks();
        book3.displayBooks();
        book4.displayBooks();
        book5.displayBooks();
    }
    Book3 [] books= {book1, book2, book3,book4, book5};
    public void searchRecord() {
        Scanner input=new Scannner(Sys.in);
        System.out.print("Enter the name of the book you want to search:");
        String inputBook=input.nextLine();
        boolean found=false;
        for (int i=0; i<books.length; i++) {
            if (books[i].getName.equalsIgnoreCase(inputBook)) {
                found=true;
                System.out.println("Book has been found");
            }
            else if(!found) {
                System.out.println("Book has not been found");
            }
        }
    }
    public static void main(String[] args) {
        BookStore books=new BookStore();
        books.displayAll();
    }
}
