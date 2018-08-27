package com.jianzhi.offer;

/**
 * @author zk
 * @date 2018年8月14日 1-n的数，1出现的次数
 */
public class NumberTime {
	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		String str = String.valueOf(n);
		char c[] = str.toCharArray();
		while (n > 0) {
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '1') {
                      count++;      
				}
			}
			n--;
		}
		return count;
	}

	public static void main(String[] args) {

	}
}
