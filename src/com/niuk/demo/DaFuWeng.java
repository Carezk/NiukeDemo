package com.niuk.demo;

import java.util.Scanner;
/*������Ϸ����Ҹ������ӵĵ��������ߵĲ����������ӵ���Ϊ1ʱ������һ��������Ϊ2ʱ����������������Ϊnʱ������n����
������ߵ���n����n<=�������������Ƿ�����Ψһ��Σ�ʱ���ܹ��ж�����Ͷ���ӵķ�����*/ 
public class DaFuWeng {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println(fun(n));
	}

	public static int fun(int n) {
		int count = 0 ;
           if (n==1) {
        	   count = 1;
		}else if (n==2) {
			count = 2;
		}else {
			for (int i = 1; i < n; i++) {
			      count += fun(n-i);	
			}
			count += 1;
		}
		return count;
	}
}
