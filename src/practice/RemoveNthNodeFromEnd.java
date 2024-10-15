package practice;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode head0 = new ListNode(1);
        head0.next = new ListNode(2);
        head0.next.next = new ListNode(3);
        head0.next.next.next = new ListNode(4);
        head0.next.next.next.next = new ListNode(5);
        ListNode head = solve(head0, 2);
        print(head);
    }

    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    private static ListNode solve(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode temp = dummy;
        prev.next = head;
        for (int i = 1; i <= n + 1; i++) {
            temp = temp.next;
        }

        while (temp != null) {
            temp = temp.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return dummy.next;
    }
}
