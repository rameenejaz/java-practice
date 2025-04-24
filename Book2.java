public class Book2 extends Publication {
    private int counter;
    public Book2() {
        super();
        counter=0;
    }
    public void pageCount() {
        counter++;
    }
    public int getCounter() {
        return counter;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Book Page count: " + getCounter());
    }


}
