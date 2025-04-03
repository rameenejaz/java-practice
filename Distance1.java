public class Distance1 {
    private int feet;
    private int inches;
    Distance1() {
        feet=0;
        inches=0;
    }
    Distance1(int feet, int inches) {
        this.feet=feet;
        this.inches=inches;
    }
    public int getFeet() {
        return feet;
    }
    public int getInches() {
        return inches;
    }
    public void setFeet(int feet) {
        this.feet=feet;
    }
    public void setInches(int inches) {
        this.inches=inches;
    }
    public void display() {
        System.out.println(feet + "feet and "+ inches+ " inches.");
    }
    public Distance1 add(Distance1 d) {
        int totalFeet=this.feet+d.feet;
        int totalInches=this.inches+d.inches;
        return new(totalFeet, totalInches);
    }
    public static void main(String[] args) {
        
    }
}
