public class Tape2 extends Publication {
    private int tapeMins;
    public void tapePlayMins() {
        tapeMins++;
    }
    public int getTapePlayMins() {
        return tapeMins;
    }
    public void display() {
        super.display();
        System.out.println("Playing time: " + getTapePlayMins() + " minutes");
    }
}
