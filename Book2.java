public class Book2 {
    private String title;
    private double price;
    private int counter;
    public Book2() {
        title="";
        price=0.0;
        counter=0;
    }
    public String getBookTitle() {
        return title;
    }
    public void setBookTitle(String title) {
        this.title=title;
    }
    public double getBookPrice () {
        return price;
    }
    public void setBookPrice(double price) {
        this.price=price;
    }
    public void pageCount() {
        counter++;
    }
    public int getCounter() {
        return counter;
    }
    public void display() {
        System.out.println("Book title:" + getBookTitle());
        System.out.println("Book Price: " + getBookPrice());
        System.out.println("Book count: " + getCounter());
    }


}
