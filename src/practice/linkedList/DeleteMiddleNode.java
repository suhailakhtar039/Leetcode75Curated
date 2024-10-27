package practice.linkedList;

import practice.ListNode;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        // head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);
        // head.next.next.next.next.next = new ListNode(6);
        print(head);
        head = solve(head);
        print(head);
    }

    public static ListNode solve(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head, prev = slow;
        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null) {
            prev.next = slow.next;
            return head;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void print(ListNode head) {
        System.out.println("-".repeat(10));
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
