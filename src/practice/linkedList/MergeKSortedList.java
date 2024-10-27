package practice.linkedList;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class Random1 implements Comparator<ListNode>{

    @Override
    public int compare(ListNode o1, ListNode o2) {
        if(o1.val > o2.val)
            return 1;
        else if (o2.val > o1.val)
            return -1;
        return 0;
    }
}
public class MergeKSortedList {
    private static ListNode solve(ListNode[] listNodes){
        ListNode ans = new ListNode(-1);
        int n = listNodes.length;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Random1());
        for (ListNode listNode : listNodes) {
            if (listNode != null)
                pq.add(listNode);
        }
        ListNode last = ans;
        while (!pq.isEmpty()){
            ListNode curr = pq.poll();
            last.next = curr;
            last = curr;
            if(curr.next!=null)
                pq.add(curr.next);
        }
        return ans.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ListNode[] listNodes = new ListNode[k];
        LinkedList linkedList = new LinkedList();
        for(int i=0; i<k; i++)
            listNodes[i] = linkedList.createList();
        for(int i=0; i<k; i++)
            linkedList.printList(listNodes[i]);

        ListNode ans = solve(listNodes);
        linkedList.printList(ans);
    }
}
