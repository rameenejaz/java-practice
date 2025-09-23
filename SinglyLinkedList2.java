public class SinglyLinkedList2 {
    Node head;
    Node tail;
    public void insertAtStart(int value) {
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int value) {
        Node newNode=new Node(value);
            if (head==null) {
                head=newNode;
                return;
            }
          newNode.data=value;
          newNode.next=null;
          tail=newNode;
           
    }
}
