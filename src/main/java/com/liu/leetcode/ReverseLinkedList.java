package com.liu.leetcode;

/**
 * Created by Administrator on 2016/2/26.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null ||head.next == null) return  head;
        ListNode temp ;
        ListNode positon = head.next;
        head.next = null; // 开始的时候没有写这句  那么最后一个的 next 不为空 就报错。
        while (positon != null){
            temp = positon;
            positon = positon.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }
    // 大神写法
    public ListNode reverseListT(ListNode head) {
        if (head != null && head.next != null)
        {
            ListNode pivot = head;
            ListNode frontier = null;
            while (pivot != null && pivot.next != null)
            {
                frontier = pivot.next;
                pivot.next = pivot.next.next;
                frontier.next = head;
                head = frontier;
            }
        }

        return head;
    }

}
