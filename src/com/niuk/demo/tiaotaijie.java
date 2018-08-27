package com.niuk.demo;

import java.util.Scanner;

//跳台阶
public class tiaotaijie {

	public static void main(String[] args) {
		tiaotaijie t = new tiaotaijie();
           Scanner sc = new Scanner(System.in);
           System.out.println("请输入: ");
           int n = sc.nextInt();
          //System.out.println(  t.JumpFloor(n)); 
	}
	 public int JumpFloor(int target) {
            if (target==1) {
				return 1;
			}else if(target==2){
				return 2;
			}else {
				return JumpFloor(target-1)+JumpFloor(target-2);
			}
	    }
}
