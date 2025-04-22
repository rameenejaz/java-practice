public class Staff extends Employee {
    private String title;
    public Staff () {
        title="";
    }
    public Staff (String title) {
        this.title=title;
    }
    public void display () {
        System.out.println("Title: " + title);
    }
}
