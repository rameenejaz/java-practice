public class displayNode {
    Node3 head;

    public void insertAtEnd(int value) {
        Node3 newNode= new Node3(value);
        if (head==null) {
            head=newNode;
            return;
        }
        Node3 temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        
    }
    public void display() {
        Node3 temp=head;
        while (temp!=null) {
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
       displayNode list=new displayNode();
       list.insertAtEnd(10);
       list.insertAtEnd(20);
       list.insertAtEnd(30);
       System.out.print("Linked List:");
       list.display();

    }
    
}
