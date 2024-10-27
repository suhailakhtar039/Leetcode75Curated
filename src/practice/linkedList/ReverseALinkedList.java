package practice.linkedList;

import practice.ListNode;

import java.util.Scanner;

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
        // ListNode nxt, prev = null, temp = head;
        // while(temp!=null){
        //     nxt = temp.next;
        //     temp.next = prev;
        //     prev = temp;
        //     temp = nxt;
        // }
        // return prev;
        if(head == null || head.next == null){
            return head;
        }
        ListNode ans = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return ans;
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
