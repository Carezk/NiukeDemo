package com.niuk.demo;

/**    
* @author zk  
* @date 2018年9月10日  
*/
import java.util.*;

public class Test {
	public static void main(String[] args) {
		int n;
		int m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		if (m < n) {
			int temp = n;
			n = m;
			m = temp;
		}
		System.out.println(GYS(n, m));
		System.out.println(GBS(n, m));
	}

	public static int GYS(int n, int m) {
		while (m % n != 0) {
			int k = m % n;
			m = n;
			n = k;
		}
		return n;
	}

	// 求最小公倍数
	public static int GBS(int n, int m) {
		// 最小公倍数就是两个数相乘再除以最大公约数
		return n * m / GYS(n, m);
	}
}
