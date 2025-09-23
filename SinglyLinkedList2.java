public class SinglyLinkedList2 {
    Node head;
    public void insertAtStart(int value) {
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int value) {
       
    }
}
