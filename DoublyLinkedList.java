//files used are node, dnode, singlylinkedlist,doublylinkedlist and main8

class DoublyLinkedList {
    DNode head;

    public void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void display() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ↔ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Bonus: shift and invert
    public void shiftAndInvert() {
        if (head == null || head.next == null) return;

        // Step 1: Move even-indexed nodes to front
        DNode dummy = new DNode(0);
        dummy.next = head;
        head.prev = dummy;

        DNode evenHead = new DNode(0);
        DNode evenTail = evenHead;

        DNode curr = head;
        int index = 1;
        while (curr != null) {
            DNode next = curr.next;
            if (index % 2 == 0) { // even index
                curr.prev.next = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;

                evenTail.next = curr;
                curr.prev = evenTail;
                evenTail = curr;
            }
            curr = next;
            index++;
        }

        if (evenHead.next != null) {
            evenTail.next = dummy.next;
            dummy.next.prev = evenTail;
            head = evenHead.next;
            head.prev = null;
        }

        // Step 2: Invert pointers
        DNode temp = null;
        curr = head;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null) head = temp.prev;
    }
}
