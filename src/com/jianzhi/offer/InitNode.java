package com.jianzhi.offer;

/**
 * @author zk
 * @date 2018年8月4日
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}
public class InitNode {
	public static ListNode FindKthToTail(ListNode head, int k) {
           if (head==null||k<=0) {
			return null;
		}
          ListNode p = head;
          ListNode last =head ;
           for (int i = 1; i < k; i++) {
        	   if (p.next!=null) {
        		   p = p.next;
			}
        	   else{
        		   return null;
        	   }
		}
           while (p.next!=null) {
			p = p.next;
			last = last.next;
		}
           return last;
	} 
}
