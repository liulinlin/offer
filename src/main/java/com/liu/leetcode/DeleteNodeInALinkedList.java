package com.liu.leetcode;

/**
 * @author liulinlin1 on 2016/9/26.
 *         <p>
 *         Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *         <p>
 *         Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
 *         the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNodeInALinkedList {
    public static void main(String[] args) {

    }

    // 覆盖的思想
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
