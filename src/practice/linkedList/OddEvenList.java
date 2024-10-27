package practice.linkedList;

import practice.linkedList.ListNode;

public class OddEvenList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);
        // head.next.next.next.next.next = new ListNode(6);

        print(head);
        head = solve(head);
        print(head);
    }

    public static ListNode solve(ListNode head){
        if(head == null || head.next == null)return head;
        ListNode odd = head, even = head.next, evenHead = even;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
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
