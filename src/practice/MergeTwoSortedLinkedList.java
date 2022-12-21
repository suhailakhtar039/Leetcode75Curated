package practice;

public class MergeTwoSortedLinkedList {
    //  recursive approach
    // private static ListNode mergeTwoLists(ListNode node1, ListNode node2) {
    //     if (node1 == null && node2 == null)
    //         return null;
    //     if (node1 == null || node2 == null)
    //         return node1 == null ? node2 : node1;
    //     ListNode ans;
    //     if (node1.val < node2.val) {
    //         ans = new ListNode(node1.val);
    //         ans.next = mergeTwoLists(node1.next, node2);
    //     } else {
    //         ans = new ListNode(node2.val);
    //         ans.next = mergeTwoLists(node1, node2.next);
    //     }
    //     return ans;
    // }

    // iterative approach
    private static ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1 == null && node2 == null)
            return null;
        if (node1 == null || node2 == null)
            return node1 == null ? node2 : node1;
        ListNode head, tail;
        if (node1.val < node2.val) {
            head = new ListNode(node1.val);
            node1 = node1.next;
        } else {
            head = new ListNode(node2.val);
            node2 = node2.next;
        }
        tail = head;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                tail.next = node1;
                node1 = node1.next;
            } else {
                tail.next = node2;
                node2 = node2.next;
            }
            tail = tail.next;
        }

        if(node1 != null)
            tail.next = node1;
        if(node2 != null)
            tail.next = node2;
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ListNode node1 = list.createList();
        list.printList(node1);

        ListNode node2 = list.createList();
        list.printList(node2);

        ListNode ans = mergeTwoLists(node1, node2);
        list.printList(ans);
    }

}
