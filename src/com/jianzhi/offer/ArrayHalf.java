package com.jianzhi.offer;

import java.util.Arrays;

/**
 * @author zk
 * @date 2018年8月12日 数组中有一个数字出现的次数超过数组长度的一半，
 *       请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 *       由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class ArrayHalf {
	public int MoreThanHalfNum_Solution(int[] array) {
		   Arrays.sort(array);
		   int i = array[array.length/2];
		   int count = 0;
		   for (int j = 0; j < array.length; j++) {
			 if (i==array[j]) {
				count++;
			}
		}
		   if (count>array.length/2) {
			return i;
		}else {
			  return 0;
		}     
	}
	public static void main(String[] args) {
		ArrayHalf a1 = new ArrayHalf();
		int array[] = {1,2,3,2,2,2,5,4,2};
		System.out.println(a1.MoreThanHalfNum_Solution(array));
	}
}
