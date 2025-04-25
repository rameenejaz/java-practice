public class Computer {
    protected int wordSize; //in bits
    protected int memorySize; //in megabytes
    protected int storageSize; //in megabytes
    protected int speed; //in megahertz
    public Computer() {
        wordSize=0;
        memorySize=0;
        storageSize=0;
        speed=0;
    }
    public Computer(int wordSize, int memorySize, int storageSize, int speed) {
        this.wordSize=wordSize;
        this.memorySize=memorySize;
        this.storageSize=storageSize;
        this.speed=speed;
    }
    public void display() {
        System.out.println("Word size: " + wordSize);
        System.out.println("Memory size: " + memorySize);
        System.out.println("Storage Size: " + storageSize);
        System.out.println("Speed: " + speed);
    }

}
