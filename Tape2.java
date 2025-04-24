public class Tape2 {
    private String tapeTitle;
    private double tapePrice;
    private int tapeMins;
    public Tape2() {
        tapeTitle="";
        tapePrice=0.0;
        tapeMins=0;
    }
    public String getTapeTitle() {
        return tapeTitle;
    }
    public void setTapeTitle(String title) {
        this.tapeTitle=title;
    }
    public double getTapePrice() {
        return tapePrice;
    }
    public void setTapePrice(double price) {
        this.tapePrice=price;
    }
    public void tapePlayMins() {
        tapeMins++;
    }
}
