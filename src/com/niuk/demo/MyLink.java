package com.niuk.demo;

public class MyLink {
       Node head = null;//头结点
	class Node{
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	private void addNode(int d) {
		Node newNode = new Node(d);//实例下一个结点
		if(head==null){
			head = newNode;
			return;
		}
		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}
	public void print() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	public static void main(String[] args) {
           MyLink list = new MyLink();
           for (int i = 0; i <10; i++) {
			list.addNode(i);
		}
           list.print();
	}

}
