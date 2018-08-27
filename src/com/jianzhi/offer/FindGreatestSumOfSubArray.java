package com.jianzhi.offer;

public class FindGreatestSumOfSubArray {
        public static int Test(int arr[]) {
			if (arr.length<1||arr==null) {
				throw new IllegalArgumentException("Array must contain an element");
			}
			int max = Integer.MIN_VALUE;
			int curMax = 0 ;
			for (int i : arr) {
				if (curMax<=0) {
					curMax=i;
				}
				else {
					curMax = curMax+i;
				}
				if (max<curMax) {
					max=curMax;
				}
			}
			return max;
		}
	public static void main(String[] args) {
           int[] data = {1, -2, 3, 10, -4, 7, 2, -5};
           System.out.println(Test(data));
	}
}
