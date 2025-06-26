// public class Book4 {
//     private String title;
//     private String author;
//     private int ID;
//     private boolean issued;
//     public int getID() {
//         return ID;
//     }
//     public String getTitle() {
//         return title;
//     }
//     public String getAuthor () {
//         return author;
//     }
//     public Book4() {
//         title="";
//         author="";
//         ID=0;
//     }
//     public Book4(String title, String author, int ID) {
//         this.title=title;
//         this.author=author;
//         this.ID=ID;
//     }
//     public boolean isIssued() {
//         return issued;
//     }
//     public void isIssued(boolean issused) {
//         this.issued=issused;
//     }

//  }

public class Book4 {
    private String id, title, author;
    private boolean isIssued;

    public Book4(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Getters and Setters
    public boolean isIssued() { return isIssued; }
    public void setIssued(boolean issued) { isIssued = issued; }
    public String getTitle() { return title; }
    public String getId() { return id; }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " by " + author + " - " + (isIssued ? "Issued" : "Available");
    }
}
