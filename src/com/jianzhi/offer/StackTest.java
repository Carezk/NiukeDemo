package com.jianzhi.offer;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author zk
 * @date 2018年8月8日 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class StackTest {
	Stack<Integer> stack = new Stack<Integer>();

	public void push(int node) {
		stack.push(node);
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int min() {
		int min = stack.peek();
		int temp = 0;
		Iterator<Integer> it = stack.iterator();
		while (it.hasNext()) {
			temp = it.next();
			if (temp < min) {
				min = temp;
			}
		}
		return min;
	}

	public static void main(String[] args) {

	}
}
