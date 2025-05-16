public class Book3 {
    private String name;
    private String publisher;
    private String author;
    public Book3() {
        name="";
        publisher="";
        author="";
    }
    public Book3(String name, String publisher, String author) {
        this.name=name;
        this.publisher=publisher;
        this.author=author;
    }
    public void displayBooks() {
        System.out.println("------------------------");
        System.out.println("Name: " + name);
        System.out.println("Publisher:" + publisher);
        System.out.println("Author:" + author);
        System.out.println("------------------------");
    }
}
