public class Publication {
    private String title;
    private double price;
    public Publication() {
        title="";
        price=0.0;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    public double getPrice () {
        return price;
    }
    public void setPrice(double price) {
        this.price=price;
    }
    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Price " + getPrice());
    }

}
