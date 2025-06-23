public class Book4 {
    private String title;
    private String author;
    private int ID;
    private boolean issued;
    public int getID() {
        return ID;
    }
    public String getTitle() {
        return title;
    }
    public String author () {
        return author;
    }
    public Book4() {
        title="";
        author="";
        ID=0;
    }
    public Book4(String title, String author, int ID) {
        this.title=title;
        this.author=author;
        this.ID=ID;
    }
    public boolean isIssued() {
        return issued;
    }
    public void isIssued(boolean issused) {
        this.issued=issused;
    }

 }
