package practice.linkedList;

import practice.ListNode;

public class MaximumSumTwinLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        // head.next.next.next.next = new ListNode(5);
        // head.next.next.next.next.next = new ListNode(6);
        // print(head);
        int ans = solve(head);
        System.out.println(ans);
    }
    public static int solve(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null, nxt = slow, cur = slow;
        while(slow != null){
            nxt = slow.next;
            slow.next = prev;

            prev = slow;
            slow = nxt;
        }
        // print(prev);
        // System.out.println(prev.val);
        int res = Integer.MIN_VALUE;
        while(head != null && prev != null){
            res = Math.max(res, prev.val + head.val);
            head = head.next;
            prev = prev.next;
        }
        return res;

    }
}
