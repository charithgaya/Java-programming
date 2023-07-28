class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList{
    public Node head;

    public SinglyLinkedList(){
        this.head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

}
public class ReverseSLinkedList {
    public static void main(String args[]){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertAtFront(11);
        linkedList.insertAtFront(20);
        linkedList.insertAtEnd(99);
        linkedList.insertAtEnd(44);

        linkedList.display();
    }
    public static void reverse(SinglyLinkedList linkedList){
        Node pre = null;
        Node current = linkedList.head;
        Node next = null;
        while(current != null){
            next = current.next;
        }
    }
}
