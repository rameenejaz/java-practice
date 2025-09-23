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
        public void insertAtEnd(int value) {
            DNode2 newNode= new DNode2(value);
            if (head==null){ //list is empty
                head=newNode;
                tail=newNode;
            }
            else {
                tail.next=newNode;
                newNode.previous=tail;
                tail=newNode;
            }
        }
        public void insertAtSpecific(int pos, int value) {
            DNode2 newNode=new DNode2(value);
            if (pos==1) {
                insertAtStart(value);
                return;
            }
            DNode2 current=head;
            for (int i=1; i<(pos-1) && current!=null; i++) {
                current=current.next;
            }
            if (current==null || current.next==null) {
                insertAtEnd(value);
            }
            else {
                DNode2 nextNode=current.next;
                current.next=newNode;
                newNode.previous=current;
                newNode.next=nextNode;
                nextNode.previous=newNode;
            }

        }
        public void deleteFromStart () {
            if (head==null) {
                System.out.println("List is empty!");
                return;
            }
            if (head.next==null) {
                head=null;
                tail=null;
            }
            else {
                head=head.next;
                head.previous=null;
            }
        }
        public void deleteFromEnd() {
            if (head==null) {
                System.out.println("List is empty!");
                return;
            }
            if (head.next==null) { //only one element
                head=null;
                tail=null;
            }
            else {
                tail=tail.previous;
                tail.next=null;
            }
        }
        public void deleteFromSpecific(int pos) {
            if (head==null) {
                System.out.println("List is empty!");
                return;
            }
            if (pos==1) {
                deleteFromStart();
                return;
            }
            DNode2 current=head;
            for (int i=1; i<pos && current!=null; i++) {
                current=current.next;
            }
            if (current==null) {
                System.out.println("Invalid Position");
                return;
            }
            if (current.next==null) {
                deleteFromEnd();
            }
            else {
                current.previous.next=current.next;
                current.next.previous=current.previous;
            }
        }

}
