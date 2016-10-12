package com.liu.leetcode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * @author liulinlin1
 * @since：2016/10/12
 */
public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }

    public static  ListNode swapPairs1(ListNode head){
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode n = head;
        ListNode m = head.next.next;

        head = head.next;
        head.next = n;
        head.next.next = swapPairs1(m);

        return head;
    }
}
