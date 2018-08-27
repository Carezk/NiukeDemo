package com.niuk.demo;

import java.util.Scanner;
/*大富翁游戏，玩家根据骰子的点数决定走的步数，即骰子点数为1时可以走一步，点数为2时可以走两步，点数为n时可以走n步。
求玩家走到第n步（n<=骰子最大点数且是方法的唯一入参）时，总共有多少种投骰子的方法。*/ 
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
