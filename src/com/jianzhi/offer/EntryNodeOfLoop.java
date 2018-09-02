package com.jianzhi.offer;

import java.security.cert.PolicyQualifierInfo;

/**    
* @author zk  
* @date 2018年9月2日  
* 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
*/
class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
public class EntryNodeOfLoop {
	 public ListNode1 EntryNodeOfLoop1(ListNode1 pHead)
	    {
	        ListNode1 p1 = pHead;
	        ListNode1 p2 = pHead;
	        while (p2!=null&&p2.next!=null) {
				p1 = p1.next;
				p2 = p2.next.next;
				if (p1==p2) {
					p1 = pHead;
					while(p1!=p2) {
						 p1 = p1.next;
						 p2 = p2.next;
					}
					if (p1==p2) {
						return p1;
					}
				}
			}
	        return null;
	    }
}
