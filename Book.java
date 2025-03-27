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
    

