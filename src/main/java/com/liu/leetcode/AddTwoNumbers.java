package com.liu.leetcode;

public class AddTwoNumbers {

	public static void main(String[] args) {
//		ListNode result1 = new ListNode(2);
//		ListNode result2 = new ListNode(5);
//
//		result1.next = new ListNode(4);
//		result1.next.next = new ListNode(3);
//
//		result2.next = new ListNode(6);
//		result2.next.next = new ListNode(4);
		
		ListNode result1 = new ListNode(0);
		ListNode result2 = new ListNode(7);
		result2.next =  new ListNode(3);

		ListNode tt = addTwoNumbers(result1, result2);
		while (tt != null) {
			System.out.print(tt.val + "   ");
			tt = tt.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode header = null;
		ListNode result = null;
		int jinwei = 0;
		header = new ListNode((l1.val + l2.val + jinwei) >= 10 ? l1.val + l2.val + jinwei - 10 : l1.val + l2.val + jinwei);
		jinwei = (l1.val + l2.val + jinwei) >= 10 ? 1 : 0;
		l1 = l1.next;
		l2 = l2.next;
		result = header;
		while (l1 != null && l2 != null) {
			header.next = new ListNode((l1.val + l2.val + jinwei) >= 10 ? l1.val + l2.val + jinwei - 10 : l1.val + l2.val + jinwei);
			jinwei = (l1.val + l2.val + jinwei) >= 10 ? 1 : 0;
			l1 = l1.next;
			l2 = l2.next;
			header = header.next;
		}
		
		while (l1 != null) {
			header.next = new ListNode(l1.val+ jinwei >= 10 ? l1.val  + jinwei - 10 : l1.val  + jinwei);
			jinwei = (l1.val+ jinwei) >= 10 ? 1 : 0;
			header = header.next;
			l1 = l1.next;
		}

		while (l2 != null) {
			header.next = new ListNode(l2.val+ jinwei >= 10 ? l2.val + jinwei - 10 : l2.val + jinwei);
			jinwei = (l2.val+ jinwei) >= 10 ? 1 : 0;
			header = header.next;
			l2 = l2.next;
		}
		if(jinwei == 1){
			header.next = new ListNode(1);
		}
		return result;
	}
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
