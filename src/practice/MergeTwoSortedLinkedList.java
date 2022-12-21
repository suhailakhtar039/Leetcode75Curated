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
