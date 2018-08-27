package com.jianzhi.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zk
 * @date 2018年8月4日
 */
public class reOrderArrayDemo {
	public static void reOrderArray(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				list.add(array[i]);
			} 
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				list.add(array[i]);
			} 
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		int array[] = { 1,2,3,4,5,6,7};
		reOrderArray(array);
	}
}
