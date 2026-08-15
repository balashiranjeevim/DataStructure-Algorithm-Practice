/*

Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: [] */

package LinkedList.Easy;

public class ReverseLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {

        ReverseLinkedList obj = new ReverseLinkedList();

        ReverseLinkedList.ListNode n1 = obj.new ListNode(1);
        ReverseLinkedList.ListNode n2 = obj.new ListNode(2);
        ReverseLinkedList.ListNode n3 = obj.new ListNode(3);
        ReverseLinkedList.ListNode n4 = obj.new ListNode(4);
        ReverseLinkedList.ListNode n5 = obj.new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ReverseLinkedList.ListNode result = obj.reverseList(n1);

        while (result != null) {
            System.out.print(result.val + " → ");
            result = result.next;
        }

        System.out.println("null");
    }
}
