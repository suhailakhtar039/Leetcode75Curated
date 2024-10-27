package practice.linkedList;

import static practice.linkedList.OddEvenList.print;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        print(head);
        head = solve(head);
        print(head);
    }

    public static ListNode solve(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode nxt = head, prev = null, cur = head;
        while (cur != null) {
            nxt = cur.next;
            cur.next = prev;

            prev = cur;
            cur = nxt;
        }
        return prev;
    }
}
