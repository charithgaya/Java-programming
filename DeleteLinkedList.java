class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList<T>{
    public Node<T> head;

    public SinglyLinkedList(){
        this.head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertAtFront(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteAtFront() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            head = head.next;
        }
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node<T> current = head;
            Node<T> previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            Node<T> current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
public class DeleteLinkedList{
    public static void main(String args[]){
        SinglyLinkedList<Object> anytypeLinkedList = new SinglyLinkedList<>();

        anytypeLinkedList.insertAtFront("Mango");
        anytypeLinkedList.insertAtFront(4);
        anytypeLinkedList.insertAtEnd('a');
        anytypeLinkedList.insertAtEnd(2.03);

        anytypeLinkedList.display();

        Object key = 4;
        deleteKey(anytypeLinkedList, key);
        System.out.println("After deleting key = " + key + " , now linked list: ");
        anytypeLinkedList.display();
    }
    public static <T> void deleteKey(SinglyLinkedList<T> linkedList, T key){
        if(linkedList.isEmpty()){
            System.out.print("linked list is empty.");
            return;
        }
        if(linkedList.head.data == key){
            linkedList.deleteAtFront();
            return;
        }
        Node<T> current = linkedList.head;

        while(current.next != null){
            if(current.next.data == key){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("Key is not found.");
    }
}