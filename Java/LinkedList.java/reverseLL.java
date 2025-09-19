public class reverseLL {
    Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Function to print DLL
    public void printList(Node node) {
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        head = temp.prev;
    }

    public static void main(String[] args) {
        reverseLL dll = new reverseLL();
        dll.insertEnd(1);
        dll.insertEnd(2);
        dll.insertEnd(3);
        dll.insertEnd(4);
        dll.insertEnd(5);

        System.out.println("Original DLL:");
        dll.printList(dll.head);

        dll.reverse();

        System.out.println("Reversed DLL:");
        dll.printList(dll.head);
    }
}
