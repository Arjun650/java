public class ll1 {
    Node head;
    Node tail;

    // Inner static class Node
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Now addFront is correctly inside ll1
    public void addFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data); 

        if(head == null){
            head = newNode; 
            tail = newNode; 
            return; 
        }
        // else{
        //     tail.next = newNode; 
        //     tail = newNode; 
        // }
        Node curNode = head; 
        while(curNode.next != null){
            curNode = curNode.next; 
        }

        curNode.next = newNode; 
        tail = newNode; 
    }

    public void addAfter(int data, int value){
        Node newNode = new Node(data);
        Node curNode = head; 

        if(head == null ){
            head = newNode; 
            tail = newNode; 
            return;
        }

        while(curNode != null && curNode.data != value){
            curNode = curNode.next; 
        }

        if(curNode == null){
            System.out.println("Data not found");
            return; 
        }

        newNode.next = curNode.next; 
        curNode.next = newNode; 

        if(newNode.next == null){
            tail = newNode; 
        }

    }

    public void addBefore(int data, int value) {
        Node newNode = new Node(data);
    
        // Case 1: Empty list
        if (head == null) {
            System.out.println("List is empty. Cannot add before value " + value);
            return;
        }
    
        // Case 2: Insert before the head
        if (head.data == value) {
            newNode.next = head;
            head = newNode;
            return;
        }
    
        // Case 3: Traverse to find the node before the one with the given value
        Node curNode = head;
        while (curNode.next != null && curNode.next.data != value) {
            curNode = curNode.next;
        }
    
        // Case 4: Value not found
        if (curNode.next == null) {
            System.out.println("Value " + value + " not found in the list.");
            return;
        }
    
        // Case 5: Insert before the found value
        newNode.next = curNode.next;
        curNode.next = newNode;
    }
    
    public void deleteFront(){
        int x; 

        if(head == null){
            System.out.println("No element");
            return; 
        }

        if(head.next == null){
            x = head.data; 
            head= tail  = null; 
        }
        else{
            x = head.data; 
            head = head.next; 
        }
        System.out.println(x + "Deleted Successfully");
    }

    public void deleteLast() {
        int x;
    
        if (head == null) {
            System.out.println("No element");
            return;
        }
    
        // Only one element
        if (head == tail || head.next == null) {
            x = head.data;
            head = tail = null;
            System.out.println(x + " Deleted Successfully");
            return;
        }
    
        Node curNode = head;
        Node prevNode = null;
    
        while (curNode.next != null) {
            prevNode = curNode;
            curNode = curNode.next;
        }
    
        x = curNode.data;
        prevNode.next = null;
        tail = prevNode;
    
        System.out.println(x + " Deleted Successfully");
    }
    
    public void deleteSpecific(int value) {
        if (head == null) {
            System.out.println("No element");
            return;
        }
    
        // If the node to delete is the head
        if (head.data == value) {
            System.out.println(value + " Deleted Successfully");
            head = head.next;
            
            // Update tail if list becomes empty
            if (head == null) {
                tail = null;
            }
            return;
        }
    
        Node curNode = head;
        while (curNode.next != null && curNode.next.data != value) {
            curNode = curNode.next;
        }
    
        // Value not found
        if (curNode.next == null) {
            System.out.println("Value not found");
            return;
        }
    
        // If the node to delete is the tail
        if (curNode.next == tail) {
            tail = curNode;
        }
    
        curNode.next = curNode.next.next;
        System.out.println(value + " Deleted Successfully");
    }
    

    public static void main(String[] args) {
        ll1 list = new ll1();
        
        list.addFront(2);
        list.addFront(1);
        list.addLast(3);
        list.addAfter(9, 1);
        list.addAfter(2, 1);
        list.addBefore(2, 1);
        list.deleteFront();

        // Print the list
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
