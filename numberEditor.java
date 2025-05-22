import java.util.Scanner;

public class numberEditor {
    private int[] array = new int[10];
    private int counter;
    numberEditor () {
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        counter=5;
    }
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
    public void insertAtStart(int number) {
        if (counter >= 10) {
            System.out.println("Array is full");
            return;
        }
        if(counter<10) {
            for (int i=counter; i>0; i++) {
                array[i]=array[i-1]; //move array right
            }
            array[0]=number;
            counter++;
            System.out.println("Number inserted at start successfully!");
        }
        if (counter >= array.length) {
            System.out.println("Array is full");
            return;
        }

    }
    public void insertAtSpecific(int pos, int inputNumber) {
        if (pos<0 || pos>counter || counter>=10) {
            System.out.println("Invalid position");
            return;
        }
        else {
            for(int i=counter; i>pos; i--) {
                //here array moves to right
                array[i]=array[i-1];
            }
            array[pos]=inputNumber;
            counter++;
            System.out.println("Number inputted at position successfully!");
        }
    }
    public void findAndReplaceAll(int oldNum, int newNum) {
        boolean found = false;
        for (int i = 0; i < counter; i++) {
            if (array[i] == oldNum) {
                array[i] = newNum; //insert new number at this index
                found = true; //repeat to replace all occurences of that number
            }
        }
        if (!found) {
            System.out.println("Number not found");
        }
        if (found) {
            System.out.println("All occurrences replaced successfully.");
        }
        
    }
    public void findAndReplaceByChoice(int oldNum, int newNum) {
        for (int i = 0; i < counter; i++) {
            if (array[i] == oldNum) {
                array[i] = newNum; //insert new number at this index
                return;
            }
            System.out.println("First occurrence replaced.");
        }
        System.out.println("Number not found");
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
            return;
        }
        //to move it left
        for (int j=pos; j<(counter-1); j++) {
            array[j]=array[j+1];
        }
        counter--;
        System.out.println("Number has been searched and deleted!");
    }
    public void searchDeleteIndex(int pos) {
        if (pos<0 || pos>=counter ) {
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
        System.out.println("Current size: " + counter);
    }
    public void displayMenu () {
        System.out.println("1. Insert number at the end of the array.");
        System.out.println("2. Insert number at the start of array");
        System.out.println("3. Insert number at specific index of the array.");
        System.out.println("4. Search and replace all numbers");
        System.out.println("5. Search and replace by choice");
        System.out.println("6. Search and delete number (first occurence).");
        System.out.println("7. Search and delete from specific index.");
        System.out.println("8. Delete all numbers.");
        System.out.println("9. View all elements.");
        System.out.println("0 to exit.");
        System.out.print("Choose from the following options (1-9 or 0 to exit): ");
    }
    public static void main(String[] args) {
        numberEditor editor=new numberEditor();
        Scanner input=new Scanner(System.in);
        int option=-99;
        while(option!=0) {
            editor.displayMenu();
            if (!input.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                input.next(); // discard invalid input
                continue;
            }
            option=input.nextInt();
           switch(option) {
            case 1:
            System.out.print("Enter the number you want to add at the end: ");   
            int num1=input.nextInt();
            editor.insertAtEnd(num1);
            break;
            case 2:
            System.out.print("Enter the number you want to add at the start: ");   
            int num2=input.nextInt();
            editor.insertAtStart(num2);
            break;
            case 3:
            System.out.print("Enter the position at which you want to insert the number: ");
            int pos1=input.nextInt();
            System.out.print("Enter the number you want to insert at position " + pos1 + ": ");
            int num3=input.nextInt();
            editor.insertAtSpecific(pos1, num3);
            break;
            case 4:
            System.out.print("Enter the old number to replace:");
            int oldNum=input.nextInt();
            System.out.print("Enter the new number:");
            int newNum=input.nextInt();
            editor.findAndReplaceAll(oldNum, newNum);
            break;
            case 5:
            System.out.print("Enter the old number to replace:");
            int oldNum1=input.nextInt();
            System.out.print("Enter the new number:");
            int newNum1=input.nextInt();
            editor.findAndReplaceByChoice(oldNum1, newNum1);
            break;
            case 6:
            System.out.print("Enter the number you want to delete: ");
            int num4=input.nextInt();
            editor.searchDeleteNum(num4);
            break;
            case 7:
            System.out.print("Enter the position of the number you want to delete: ");
            int pos2=input.nextInt();
            editor.searchDeleteIndex(pos2);
            break;
            case 8:
            editor.deleteAll();
            break;
            case 9:
            editor.viewAll();
            break;
            case 0:
            System.out.println("Exiting the program!");
            break;
            default:
            System.out.println("Invalid choice! Please select a valid option.");
        }
    }
    input.close();
}
}
