package com.jianzhi.offer;

/**
 * @author zk
 * @date 2018年9月2日 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 *       例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */

class ListNode2 {
	int val;
	ListNode2 next = null;

	ListNode2(int val) {
		this.val = val;
	}
}

public class DeleteDuplication {

	public ListNode2 deleteDuplication(ListNode2 pHead) {
		if (pHead == null) {
			return null;
		}
		ListNode2 pNode2 = null;
		ListNode2 node2 = pHead;
		while (node2 != null) {
			if (node2.next != null && node2.next.val == node2.val) {
				int value = node2.val;
				while (node2.next != null && node2.next.val == value) {
                      node2 = node2.next;
				}
				if (pNode2==null) {
					pHead = node2.next;
				}else {
					pNode2.next = node2.next;
				}
			}
			else {
				pNode2 = node2;
			}
			node2 = node2.next;
		}
		return pHead;
	}
}
