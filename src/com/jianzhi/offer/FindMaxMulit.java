package com.jianzhi.offer;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 *     输入n个数，求三个数的最大乘积
* @author zk  
* @date 2018年8月2日  
*/  
public class FindMaxMulit {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
	        while (sc.hasNext()) {  
	            int n = sc.nextInt();  
	            long[] nums = new long[n];  
	            for (int i = 0; i < n; i++) {  
	                nums[i] = sc.nextLong();  
	            }  
	            Arrays.sort(nums);  
	            System.out.println(Arrays.toString(nums));
	            System.out.println(Math.max(nums[n - 1] * nums[0] * nums[1], nums[n - 1] * nums[n - 2] * nums[n - 3]));  
	        }  
	    }  
}
