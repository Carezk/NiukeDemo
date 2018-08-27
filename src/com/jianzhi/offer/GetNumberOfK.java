package com.jianzhi.offer;

/**
 * @author zk
 * @date 2018年8月16日
 * 一个数在数组中出现的次数
 */
public class GetNumberOfK {

	public int GetNumberOfK1(int[] array, int k) {
		int count = 0;
		if (array == null || array.length == 0) {
			return count;
		}
		for (int i = 0; i < array.length; i++) {
			if (k == array[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
