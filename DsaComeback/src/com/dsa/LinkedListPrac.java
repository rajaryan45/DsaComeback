package com.dsa;



import com.linkedlistbase.ListNode;


public class LinkedListPrac {
	
	public static ListNode listBuilder(int[] ar) {
		ListNode listNode = new ListNode(ar[0]);
		ListNode headListNode = listNode;
		for(int i = 1 ; i < ar.length ; i++) {
			ListNode listNode2 = new ListNode(ar[i]);
			System.out.println(listNode + "  " + listNode2 + "  " + ar[i]);
			listNode.next = listNode2;
			listNode = listNode2;
		}
		return headListNode;
	}
	
	
	public static void main(String[] args) {
		int[] ar = {1,2};
		
		ListNode headListNode = listBuilder(ar);
		ListNode temp = headListNode;
		temp.displayNodes(headListNode);
		System.out.println(headListNode);
		

		
		
		
		temp.displayNodes(headListNode);

//		}
		
	}
	
}
