package com.niuk.demo;

/**
 * @author zk
 * @date 2018年8月27日 快速排序
 */
public class QuickSort {
	public static void Sort(int arr[], int low, int high) {

		int l = low;
		int h = high;
		int temp = arr[low];

		while (l < h) {
			while (l < h && arr[h] >= temp) {
				h--;
			}
			if (l < h) {
				int temp2 = arr[h];
				arr[h] = arr[l];
				arr[l] = temp2;
				l++;
			}
			while (l < h && arr[l] <= temp) {
				l++;
			}
			if (l < h) {
				int temp3 = arr[h];
				arr[h] = arr[l];
				arr[l] = temp3;
                h--;
			}
		}
		// System.out.println(arr.toString());
		// System.out.print("l="+(l+1)+"h="+(h+1)+"temp="+temp+"\n");
		if (l > low) {
			Sort(arr, low, l - 1);
		}
		if (h < high) {
			Sort(arr, l + 1, high);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 30, 50, 10, 90, 20, 70 };
		Sort(arr, 0, 5);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
