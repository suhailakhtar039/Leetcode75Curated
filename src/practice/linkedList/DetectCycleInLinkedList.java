package practice.linkedList;

import practice.ListNode;

public class DetectCycleInLinkedList {
    private static boolean isCycle(ListNode head){
        if(head == null || head.next == null)
            return false;
        ListNode slow = head, fast = head.next.next;
        while(fast != null && fast.next != null){
            if(slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        ListNode head = new ListNode(1);
        ListNode t = new ListNode(2);
        // ListNode t1 = new ListNode(3);
        // ListNode t2 = new ListNode(4);
        // ListNode t3 = new ListNode(5);
        head.next = t;
        // t.next = t1;
        // t1.next = t2;
        // t2.next = t3;
        //
        // //cycle
        // t3.next = t1;
        linkedList.printList(head);
        System.out.println(isCycle(head));
    }
}
