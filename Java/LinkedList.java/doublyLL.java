public class doublyLL {
    Node head; 
    Node tail; 

    static class Node{
        int data; 
        Node prev; 
        Node next; 

        Node(int data){
            this.data = data; 
            this.prev = null;
            this.next = null;
        }
    }

    public void insertFront(int data){
        Node newNode = new Node(data); 

        if(head == null){
            head = newNode; 
            tail = newNode; 
        }

        newNode.next = head; 
        head.prev = newNode; 
        head = newNode; 
    }
}
