package practice;

import java.util.List;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

class LinkedList{
    public ListNode createList() {
        ListNode head = null;
        ListNode temp = null;
        boolean first = true;
        while (true) {
            int x;
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            if (x == -1) break;
            if (first) {
                head = new ListNode(x);
                temp = head;
                first = false;
            } else {
                temp.next = new ListNode(x);
                temp = temp.next;
            }
        }
        System.out.println("head = " + head.val);
        System.out.println("last = " + temp.val);
        return head;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
}

class LinkedListUtility{
    public ListNode reverseList(ListNode head){
        ListNode nxt = null, prev = null, temp = head;
        while(temp!=null){
            nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        return prev;
    }
}

public class ReverseALinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        ListNode head = l.createList();
        l.printList(head);

        LinkedListUtility funCall = new LinkedListUtility();
        ListNode reversed = funCall.reverseList(head);
        l.printList(reversed);
    }
}
