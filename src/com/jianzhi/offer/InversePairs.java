package com.jianzhi.offer;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author zk
 * @date 2018年8月15日
 * 数组中的逆序对
 */
public class InversePairs {

	public int InversePairs1(int[] array) {//时间复杂度O(n2)
		int count = 0 ;
         for (int i = 0; i < array.length; i++) {
        	 for(int j = i+1 ; j<array.length;j++) {
        		  if (array[i]>array[j]) {
					count++;
				}
        	 }
		}
         return count;
	}

	public int InversePairs2(int[] array) {
		 if (array==null||array.length<=1) {
				return 0 ;
			}
			int [] copy = new int[array.length] ;
			for (int i = 0; i < array.length; i++) {
				copy[i] = array[i];
			}
			return mergeCount(array,copy,0,array.length-1);
			
		}
		public static int mergeCount (int array[],int[] copy,int start,int end) {
			if (start==end) {
				copy[start] = array[start];
				return 0 ;
			}
			int mid = (start+end)>>1;
			int leftCount = mergeCount(array, copy, start, mid)%1000000007;
			int rightCount = mergeCount(array, copy, mid+1, end)%1000000007;
			int count = 0 ;
			int i = mid;
			int j = end;
			int index = end;
			while (i>=start&&j>=mid+1) {
				if (array[i]>array[j]) {
					copy[index--] = array[i--];
					count +=j-mid;
	                if(count>1000000007){
	                    count = count%1000000007;
	                }
				}else {
					copy[index--] = array[j--];
				}
			}
			for (;i>=start;i--) {
				copy[index--] = array[i];
			}
			for(;j>=mid+1;j--) {
				copy[index--] = array[j];
			}
			for(int s=start;s<=end;s++) {
				array[s] = copy[s];
			}
	            return (leftCount+rightCount+count)%1000000007;	
	    }
	public static void main(String[] args) {
           int array[] = {7,5,6,4};
           System.out.println(new InversePairs().InversePairs2(array));
	}
}
