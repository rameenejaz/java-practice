//files used are node, dnode, singlylinkedlist,doublylinkedlist and main7

class SinglyLinkedList {
    Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertAtStart(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) 
        temp = temp.next;
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    public void deleteFromPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (pos == 1) {
            deleteFromStart();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) temp = temp.next;
        if (temp == null || temp.next == null) {
            System.out.println("Position out of range!");
            return;
        }
        temp.next = temp.next.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Item found: " + value);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }
}