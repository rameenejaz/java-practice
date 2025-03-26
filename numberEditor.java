import java.util.Scanner;

public class numberEditor {
    private int[] array=new int[10];
    private int counter=0;
    public void insertAtEnd(int number) {
        if(counter<10) {
            array[counter]=number;
            counter++;
            System.out.println("Number added successfully at end!");
        }
        else {
            System.out.println("Array is full");
        }
    }
    public void insertAtSpecific(int pos, int inputNumber) {
        //here array moves to right
        if (pos<0 || pos>counter || counter>=10) {
            System.out.println("Invalid position");
            return;
        }
        else {
            for(int i=counter; i>pos; i--) {
                array[i]=array[i-1];
            }
            array[pos]=inputNumber;
            counter++;
            System.out.println("Number inputted at position successfully!");
        }
    }
    public void searchDeleteNum(int inputNumber) {
        int pos=-1;
        for(int i=0; i<counter; i++) {
            if (array[i]==inputNumber) {
                pos=i;
                break;
            }
        }
        if (pos==-1) {
            System.out.println("Number not found!");
        }
        //to move it left
        for (int j=pos; j<(counter-1); j++) {
            array[j]=array[j+1];
        }
        counter--;
        System.out.println("Number has been searched and deleted!");
    }
    public void searchDeleteIndex(int pos) {
        if (pos<0 || pos>counter ) {
            System.out.println("Invalid index");
        }
        else {
            for (int i=pos; i<counter; i++) {
                array[i]=array[i+1];
            }
            counter--;
            System.out.println("Number deleted at index: " + pos);
        }
    }
    public void deleteAll() {
        counter=0;
        System.out.println("All numbers in index deleted successfully!");
    }
    public void viewAll() {
        System.out.print("Array:");
        for(int i=0; i<counter; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public void displayMenu () {
        System.out.println("1. Insert number at the end of the array.");
        System.out.println("2. Insert number at specific index of the array.");
        System.out.println("3. Search and delete number.");
        System.out.println("4. Search and delete from specific index.");
        System.out.println("5. Delete all numbers.");
        System.out.println("6. View all elements.");
        System.out.println("0 to exit.");
        System.out.print("Choose from the following options (1-6 or 0 to exit): ");
    }
    public static void main(String[] args) {
        numberEditor editor=new numberEditor();
        Scanner input=new Scanner(System.in);
        int option=-99;
        while(option!=0) {
            editor.displayMenu();
            option=input.nextInt();
           switch(option) {
            case 1:
            System.out.print("Enter the number you want to add at the end: ");   
            int num1=input.nextInt();
            editor.insertAtEnd(num1);
            break;
            case 2:
            System.out.print("Enter the position at which you want to insert the number: ");
            int pos1=input.nextInt();
            System.out.print("Enter the number you want to insert at position " + pos1 + ": ");
            int num2=input.nextInt();
            editor.insertAtSpecific(pos1, num2);
            break;
            case 3:
            System.out.print("Enter the number you want to delete: ");
            int num3=input.nextInt();
            editor.searchDeleteNum(num3);
            break;
            case 4:
            System.out.print("Enter the position of the number you want to delete: ");
            int pos2=input.nextInt();
            editor.searchDeleteIndex(pos2);
            break;
            case 5:
            editor.deleteAll();
            break;
            case 6:
            editor.viewAll();
            break;
            case 0:
            System.out.println("exiting the program!");
            break;
            default:
            System.out.println("Invalid choice! Please select a valid option.");
           }     
    }
    input.close();
    }
}
