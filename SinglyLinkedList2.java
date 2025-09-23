//methods for singly linked list
//files used are Node2, SinglyLinkedList2, DNode2 and DoublyLinkedList2
public class SinglyLinkedList2 {
    Node2 head;
    Node2 tail;
    //insert methods
    public void insertAtStart(int value) {
        Node2 newNode=new Node2(value);
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
        Node2 previous=new Node2(value);
        Node2 current=new Node2(value);
        if (pos==1) {
            insertAtStart(value);
        }
        current=head;
        for (int i=1; i<pos; i++) {
            previous=current;
            current=current.next;
        }
        temp.data=value;
        previous.next=temp;
        temp.next=current;
    }
    //delete methods
    public void deleteFromStart() {
        if (head==null) {
            System.err.println("List is empty!");
        }
        else {
            head=head.next;
        }
    }
    public void deleteFromEnd() {
        Node2 current=head;
        Node2 previous=null;
        current=head;
        if (head==null) {
           System.err.println("List is empty");
           return;
        }
        while(current.next!=null) {
            previous=current;
            current=current.next;
        }
        previous.next=null;
        tail=previous;
        // delete current;
    }
    public void deleteFromSpecific(int pos, int value) {
        Node2 current=head;
        Node2 previous=null;
        for (int i=0; i<pos; i++) {
            previous=current;
            current=current.next;
        }
        previous.next=current.next;
    }
    //display content of linked list
    public void displayContent() {
        Node2 temp=head;
        while (temp!=null) {
            System.err.print(temp.data + "->");
            temp=temp.next;
        }
        System.err.println("NULL");
    }
    public void searchItem(int value) {
        Node2 temp=head;
        while(temp!=null) {
            if (temp.data==value) {
                System.err.println("Item found: " + value);
                return;
            }
            temp=temp.next;
        }
        System.err.println("Item not found!");
    }
}
