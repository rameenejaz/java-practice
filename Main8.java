import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SinglyLinkedList2 sll=new SinglyLinkedList2();
        DoublyLinkedList2 dll=new DoublyLinkedList2();
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1.Singly Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice 1 or 2 (or 3 to exit):");
            int choice=sc.nextInt();
            if (choice==3) {
                System.out.println("Exiting!!");
                break;
            }
            while (true) {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Insert at Start ");
                System.out.println("2. Insert at End ");
                System.out.println("3. Insert at Position ");
                System.out.println("4. Delete from Start ");
                System.out.println("5. Delete from End ");
                System.out.println("6. Delete from Position ");
                System.out.println("7. Display ");
                System.out.println("8. Search ");
                System.out.println("9. Go Back");
                System.out.print("Enter choice: ");
            }
        }
    }
}
