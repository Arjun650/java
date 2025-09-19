// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CycleLL {
    // Function to create a cyclic linked list
    public static ListNode createCyclicList() {
        // Create nodes
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        // Connect nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle (link last node to second node)
        fourth.next = second; // cycle created here

        return head;
    }

    public static int returnCycleLength(ListNode head) {
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detection loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // <-- if cycle found, exit detection
                // Step 2: Count loop
                count = 1;
                ListNode temp = slow.next;
                while (temp != slow) { // <-- runs only after detection succeeds
                    temp = temp.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ListNode head = createCyclicList();

        System.out.println(returnCycleLength(head));
    }
}
