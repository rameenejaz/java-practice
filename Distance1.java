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
        return new Distance1(totalFeet, totalInches);
    }
    public void convert() {
        if (inches>=12) {
            feet+=(inches/12);
            inches=inches%12;
        }
    }
    public static void main(String[] args) {
        Distance1 d1=new Distance1(5,9);
        Distance1 d2=new Distance1(4,5);
        d1.display();
        d2.display();
        Distance1 sum=d1.add(d2);
        sum.display();

    }
}
