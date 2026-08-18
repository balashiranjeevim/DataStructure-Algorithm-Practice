/*

Remove Nth Node From End of List

Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz


*/


package LinkedList.Medium;

public class RemoveNthNodeFromEndofList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointer = head;
        int counter = 0;

        while (pointer != null) {
            counter++;
            pointer = pointer.next;
        }

        int previous = counter - n;
        pointer = head;

        if (previous == 0) {
            return head.next;
        } else {
            for (int i = 1; i < previous; i++) {
                pointer = pointer.next;
            }
            pointer.next = pointer.next.next;
        }

        return head;
    }

    public static ListNode buildList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        System.out.print("[");

        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = buildList(values);
        int n = 2;

        System.out.println("Original Linked List:");
        printList(head);

        head = removeNthFromEnd(head, n);

        System.out.println("After removing the " + n + "th node from the end:");
        printList(head);
    }
}
