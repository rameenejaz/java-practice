public class DoublyLinkedList2 {
        DNode2 head;
        DNode2 tail;
        public void insertAtStart(int value) {
            DNode2 newNode=new DNode2(value);
            if (head==null){ //list is empty
                head=newNode;
                tail=newNode;
            }
            else {
                newNode.next=head;
                head.previous=newNode;
                head=newNode;
            }
        }
}
