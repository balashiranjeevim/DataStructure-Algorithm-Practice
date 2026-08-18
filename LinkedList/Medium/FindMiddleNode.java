/*

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 
Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100

*/

package LinkedList.Medium;

public class FindMiddleNode {
    
    // Definition for singly-linked list
    public static class ListNode {
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
    
    // Find the middle node using slow and fast pointer approach
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
    // Helper method to build a linked list from array
    public static ListNode buildLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        
        return head;
    }
    
    // Helper method to print linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Main method to test
    public static void main(String[] args) {
        FindMiddleNode solution = new FindMiddleNode();
        
        // Test case 1: [1,2,3,4,5]
        ListNode head1 = buildLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode middle1 = solution.middleNode(head1);
        System.out.print("Example 1 - Input: [1,2,3,4,5], Output: ");
        printLinkedList(middle1);
        
        // Test case 2: [1,2,3,4,5,6]
        ListNode head2 = buildLinkedList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode middle2 = solution.middleNode(head2);
        System.out.print("Example 2 - Input: [1,2,3,4,5,6], Output: ");
        printLinkedList(middle2);
    }
}
