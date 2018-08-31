package com.niuk.demo;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

/**    
* @author zk  
* @date 2018年8月30日  
*/
public class MergeSort {
	
	public static  void mergeSort (int[] data,int left,int right) {
		if (left>=right) {
			return;
		}
		//找出中间索引
		int center = (left+right)/2;
		//对左边数组进行递归
		mergeSort(data, left, center);
		//对右边数组进行递归
		mergeSort(data, center+1,right );
		//合并
		mergeSort(data, left, right);
	}
        
	public static void merge(int[] data , int left,int center,int right) {
		
		int[] tmpArr = new int[data.length];
		int mid = center+1;
		int third = left;
		int tmp = left;
		while (left<=center&&mid<=right) {
			if (data[left]<=data[mid]) {
				tmpArr[third++] = data[left++];
			}else {
				tmpArr[third++] = data[mid++];
			}
		}
	    while (mid<=right) {
			tmpArr[third++] = data[mid++];
		}
	    while (left<=center) {
			tmpArr[third++] = data[left++];
		}
	    while (tmp<=right) {
	    	data[tmp] = tmpArr[tmp++];
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
