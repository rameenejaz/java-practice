import java.util.Scanner;
public class evenOrOdd {
    public static void main(String[] args) {
        Scanner numberIn= new Scanner(System.in);
        System.out.print("Enter a number to determine if it is even or odd:");
        int inputNumber=numberIn.nextInt();
        if (inputNumber % 2==0) {
            System.out.print("number is even");
        }
        else {
            System.out.print( "number is odd");
        }
        numberIn.close();
    }
}
