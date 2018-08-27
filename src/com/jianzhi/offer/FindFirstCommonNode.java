package com.jianzhi.offer;

import java.util.HashMap;

/**
 * @author zk
 * @date 2018年8月16日
 */
/*class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}*/

public class FindFirstCommonNode {

	public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null || pHead2 == null) {
			return null;
		}
		HashMap<ListNode, Integer> map = new HashMap<>();
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		while (p1 != null) {
			map.put(p1, null);
			p1 = p1.next;
		}
		while (p2 != null) {
			if (map.containsKey(p2)) {
				return p2;
			}
			p2 = p2.next;
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
