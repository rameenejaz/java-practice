//files used are node, dnode, singlylinkedlist,doublylinkedlist and main8
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
                int option=sc.nextInt();
                if (option==9) {
                    break;
                }
                int value=0;
                if (option==1 || option==2 || option==3 || option==8) {
                    System.out.print("Enter value: ");
                    value=sc.nextInt();
                }
                switch (choice) {
                    case 1: //for singly linked list 
                        switch (option) {
                            case 1:
                            sll.insertAtStart(value);
                            break;
                            case 2:
                            sll.insertAtEnd(value);
                            break;
                            case 3:
                            System.out.println("Enter Position: ");
                            int pos1=sc.nextInt();
                            sll.insertAtSpecific(pos1, value);
                            case 4: 
                            sll.deleteFromStart(); 
                            break;
                            case 5: 
                            sll.deleteFromEnd(); 
                            break;
                            case 6:
                            System.out.print("Enter position: ");
                            int pos2 = sc.nextInt();
                            sll.deleteFromSpecific(pos2, value); 
                            break;
                            case 7: 
                            sll.displayContent(); break;
                            case 8: 
                            sll.searchItem(value); 
                            break;
                        }
                        break;
                        case 2:
                        switch (option) {
                            case 1: 
                            dll.insertAtStart(value); 
                            break;
                            case 2: 
                            dll.insertAtEnd(value); 
                            break;
                            case 3:
                                System.out.print("Enter position: ");
                                int pos1 = sc.nextInt();
                                dll.insertAtSpecific(pos1, value); 
                                break;
                            case 4: 
                            dll.deleteFromStart(); 
                            break;
                            case 5: 
                            dll.deleteFromEnd(); 
                            break;
                            case 6:
                                System.out.print("Enter position: ");
                                int pos2 = sc.nextInt();
                                dll.deleteFromSpecific(pos2); 
                                break;
                            case 7: 
                            dll.displayContent(); 
                            break;
                            case 8: 
                            dll.searchItem(value); 
                            break;
                }
                break;

                }
            }
        }
        sc.close();
    }
}
