public class finalLL {
    Node head; 
    Node tail; 
    
    static class Node{
        int data; 
        Node next; 

        Node(int data){
            this.data = data; 
            this.next = null; 
        }
    }

    public void addFront(int data){
        Node newNode = new Node(data); 

        if(head == null){
            head = newNode; 
            tail = newNode; 
            return; 
        }
        newNode.next = head; 
        head = newNode; 
        
    }

    public void addLast(int data){
        Node newNode = new Node(data); 

        if(head == null){
            head = newNode; 
            tail = newNode; 
            return; 
        }

        tail.next = newNode; 
        tail = newNode; 
    }

    public void addAfter(int data, int value){
        Node newNode = new Node(data); 

        if(head == null){
            System.out.println("This list is empty");
            return; 
        }

        if(head.data == value ){
            head.next = newNode; 
        }

        Node curNode = head; 


        while(curNode != null && curNode.data != value){
            curNode = curNode.next; 
        }

        if(curNode == null){
            System.out.println("No data Found");
            return; 
        }

        newNode.next = curNode.next; 
        curNode.next = curNode; 

    }

    
}
