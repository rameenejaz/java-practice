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
        }
            System.out.println("Book not available for borrowing.");
    }
    public void returnBook(String title, User user) {
        for (int i=0; i<counter; i++) {
            if(books[i].getTitle().equals(title) && books[i].isBorrowed()) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("No book with this title to borrowed");
    }
    public void displayLibrary() {
        System.out.println("---- Library Books ----");
        if (counter == 0) {
            System.out.println("No books available in the library.");
        } 
        else {
            for (int i = 0; i < counter; i++) {
                System.out.println((i + 1) + ". " + books[i].getTitle() + " - " + (books[i].isBorrowed() ? "Borrowed" : "Available"));
            }
        }
        System.out.println();
    }
}