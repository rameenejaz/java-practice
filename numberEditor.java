public class numberEditor {
    private int[] array={0};
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
    public void insetAtSpecific(int pos, int inputNumber) {
        //here array moves to right
        if (pos<0 || pos>counter || counter>10) {
            System.out.println("Invalid position or array if full");
            return;
        }
        else {
            for(int i=counter; i>pos; i--) {
                array[i]=array[i-1];
            }
            array[pos]=inputNumber;
            counter--;
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
            array[j-1]=array[j];
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
    public static void main(String[] args) {
        
    }
}
