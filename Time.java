import java.util.Scanner;
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    Time() {
        hours=0;
        minutes=0;
        seconds=0;
    }
    Time(int inHours, int inMinutes, int inSeconds) {
       if (inHours>=0 && inHours<24) {
        hours=inHours;
       }
       else {
        System.out.println("invalid hours entered, enter between (0-23):");
        hours=0;
       }
       if(inMinutes>=0 && inMinutes<60) {
        minutes=inMinutes;
       }
       else {
        System.out.println("invalid minutes entered, enter between (0-59):");
        minutes=0;
       }
       if(inSeconds>=0 && inSeconds<60) {
        seconds=inSeconds;
       }
       else {
        System.out.println("Invalid seconds entered, enter between (0-59)");
        seconds=0;
       }
    }
    public void display() {
        // System.out.println("\nTime:\n");
        System.out.printf("Time: %02d:%02d:%02d", hours,seconds,minutes);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\nThe Default time:\n");
        Time calculateTime= new Time();
        calculateTime.display();
        System.out.println("\nEnter hours:");
        int hours=input.nextInt();
        System.out.println("\nEnter minutes:");
        int minutes=input.nextInt();
        System.out.println("\nEnter seconds:");
        int seconds=input.nextInt();
        Time calculateTime2=new Time(hours, minutes, seconds);
        calculateTime2.display();
        input.close();
    }
}
