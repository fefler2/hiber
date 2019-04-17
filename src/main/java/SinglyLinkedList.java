public class SinglyLinkedList {
    Node head;

     class Node {
        int data;

        Node next;
        Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public void traversal(){
        Node n = head;
        while (n!=null){
            System.out.println(n.data+" ");
            n = n.next;
        }
    }

    public void perform(){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.head = new Node(4);
        Node second = new Node(7);
        Node third = new Node(11);
        linkedList.head.next=second;
        second.next=third;
        linkedList.traversal();
    }

    public static void main(String[] args) {


        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.perform();

    }

}
