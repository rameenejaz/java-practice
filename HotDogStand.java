public class HotDogStand {
    private int standIDNum;
    private int numOfHDSold;
    public HotDogStand () {
        standIDNum=0;
        numOfHDSold=0;
    }
    public HotDogStand(int ID, int numOfHDSold) {
        this.standIDNum=ID;
        this.numOfHDSold=numOfHDSold;
    }
    public void justSold () {
        numOfHDSold++;
    }
    public int getStandID () {
        return standIDNum;
    }
    public int getHDSold () {
        return numOfHDSold;
    }
    public void display () {
        System.out.println("Stand:" + standIDNum + ", Hot Dogs Sold:"+ numOfHDSold);
    }

    public static void main(String[] args) {
        HotDogStand stand1=new HotDogStand(100,20);
        HotDogStand stand2=new HotDogStand(200,30);
        HotDogStand stand3=new HotDogStand(300,40);
        stand1.justSold();
        stand2.justSold();
        stand2.justSold();
        stand3.justSold();
        stand3.justSold();

        stand1.display();
        stand2.display();
        stand3.display();
    }
}
