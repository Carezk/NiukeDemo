package com.niuk.demo;

/**    
* @author zk  
* @date 2018年8月26日  
* 单链表
*/
class Node{
	public int data;
	Node next;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(int data) {
		this.data = data;
	}
}
public class Link01 {
	Node head = null;
	public void addNode(Node newnode) {
		if (head==null) {
			head = newnode;
			return;
		}
		Node temp = head; 
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
	}
	
	
    public void print() {
    	Node temp = head;
    	while(temp.next!=null) {
    		System.out.println(temp.data+" ");
    		temp = temp.next;
    	}
    }
	public static void main(String[] args) {
	       Link01 link01 = new Link01();
	    	 for (int i = 0; i < 10; i++) {
	    		 link01.addNode(new Node(i));
			} 
	    	 link01.print();
	          
	}
}
