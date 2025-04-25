public class Laptop extends Computer{
    private int length;
    private int width;
    private int height;
    private int weight;
    public Laptop() {
        super();
        length=0;
        width=0;
        height=0;
        weight=0;
    }
    public Laptop(int wordSize, int memorySize, int storageSize, int speed, int length, int width, int height, int weight) {
        super(wordSize, memorySize,storageSize, speed);
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
    }
}
