package com.jianzhi.offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zk
 * @date 2018年8月14日
 *       输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，
 *       则最小的4个数字是1,2,3,4,。
 */
public class MinNumber {
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		 ArrayList<Integer> list = new ArrayList<>();
           if (k>input.length) {
			return list;
		}
		   Arrays.sort(input);
		   for (int i = 0; i < k; i++) {
			list.add(input[i]);
		}   
		   return list;
	}
	public static void main(String[] args) {
		MinNumber mNumber = new MinNumber();
		int input[] = {4,5,1,6,2,7,3,8};
		int k = 4;
		System.out.println(mNumber.GetLeastNumbers_Solution(input, k));
	}
}
