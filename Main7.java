import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList();
        DoublyLinkedList dll = new DoublyLinkedList();

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
            System.out.println("9. Insert at End ");
            System.out.println("10. Display ");
            System.out.println("11. Shift & Invert ");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    sll.insertAtStart(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    sll.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    sll.insertAtPosition(val, pos);
                    break;
                case 4:
                    sll.deleteFromStart();
                    break;
                case 5:
                    sll.deleteFromEnd();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    sll.deleteFromPosition(sc.nextInt());
                    break;
                case 7:
                    sll.display();
                    break;
                case 8:
                    System.out.print("Enter value to search: ");
                    sll.search(sc.nextInt());
                    break;
                case 9:
                    System.out.print("Enter value: ");
                    dll.insertAtEnd(sc.nextInt());
                    break;
                case 10:
                    dll.display();
                    break;
                case 11:
                    dll.shiftAndInvert();
                    System.out.println("After shift & invert:");
                    dll.display();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}