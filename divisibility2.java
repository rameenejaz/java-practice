import java.util.Scanner;

public class divisibility2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Scanner inputNumber2=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int number1=input.nextInt();
        System.out.print("Enter the second number:");
        int number2=input.nextInt();
        System.out.print("The numbers divisible by 3 and 11 (or 7):");
        for (int i=number1; i<=number2; i++) {
            if ((i%3==0 && i%11==0) ) {  
                    System.out.print(i+" ");
            }
        }
        input.close();
    }
}

