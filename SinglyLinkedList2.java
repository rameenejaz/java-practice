//methods for singly linked list
//files used are Node2, SinglyLinkedList2, DNode2 and DoublyLinkedList2
public class SinglyLinkedList2 {
    Node2 head;
    Node2 tail;
    //insert methods
    public void insertAtStart(int value) {
        Node2 newNode=new Node2(value);
        if (head==null) {
                head=newNode;
                tail=newNode;
                return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int value) {
        Node2 newNode=new Node2(value);
            if (head==null) {
                head=newNode;
                tail=newNode;
                return;
            }
          tail.next=newNode;
          tail=newNode;  
    }
    public void insertAtSpecific(int pos, int value) {
        Node2 temp=new Node2(value);
        Node2 previous=null;
        Node2 current=head;
        if (pos==1) {
            insertAtStart(value);
            return;
        }
        current=head;
        for (int i=1; i<pos; i++) {
            previous=current;
            current=current.next;
        }
        if (previous == null) {
        System.err.println("Invalid position!");
        return;
    }
        temp.data=value;
        previous.next=temp;
        temp.next=current;
        if (current == null) { // inserted at end
        tail = temp;
    }
    }
    //delete methods
    public void deleteFromStart() {
        if (head==null) {
            System.err.println("List is empty!");
            return;
        }
        head=head.next;
        if (head==null) {
            tail=null;
        }
    }
    public void deleteFromEnd() {
        Node2 current=head;
        Node2 previous=null;
        current=head;
        if (head==null) {
           System.out.println("List is empty");
           return;
        }
         if (head.next == null) { // only one node
        head = tail = null;
        return;
    }

        while(current.next!=null) {
            previous=current;
            current=current.next;
        }
        current.next = null;
        tail = current;
        // delete current;
    }
    public void deleteFromSpecific(int pos, int value) {
        Node2 current=head;
        Node2 previous=null;
        if (head==null) {
           System.out.println("List is empty");
           return;
        }
        if (pos==1) {
            insertAtStart(value);
            return;
        }
        for (int i=1; i<pos && current!=null; i++) {
            previous=current;
            current=current.next;
        }
        if (current==null) {
            System.out.println("Invalid position");
            return;
        }
        previous.next=current.next;
        if (current==tail) {
            tail=previous;
        }
    }
    //display content of linked list
    public void displayContent() {
        Node2 temp=head;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void searchItem(int value) {
        Node2 temp=head;
        while(temp!=null) {
            if (temp.data==value) {
                System.out.println("Item found: " + value);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item not found!");
    }
}
