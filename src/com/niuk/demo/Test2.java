package com.niuk.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**    
* @author zk  
* @date 2018年9月10日  
*/

public class Test2 { 
	
	private static int count = 0;
    static int getCount(int n,int sum,int[] array) {
    	Test2.quickSort(array, 0, array.length-1);
    	Test2.sum(array,array.length-1,sum);
        return count;
    }
    
    private  static int[] sum(int[] array,int n,int sum) {
        if(n == 0){
            return new int[]{array[0]};
        }
        
        int length = (int)Math.pow(2, (n+1))-1;
        int a[] = new int[length];
        int b[] = sum(array,n-1,sum);
        
        int i=0;
        for(i=0; i<(length-1)/2; i++) {
            a[i] = b[i];
            int temp = b[i] + array[n];
            if(temp == sum){
                count++;
            }
            a[i+(length+1)/2] = temp;
        }
        if(array[n] == sum) {
            count++;
        }
        a[(length-1)/2] = array[n];
        
        return a;
    }
    
    private static void quickSort(int []array, int left, int right) {
        if(left >= right) {
            return;
        }
        int q = pagenation(array, left, right);
        quickSort(array, left, q-1);
        quickSort(array, q+1, right);
    }
    
    private static int pagenation(int []array, int left, int right) {
        int i=left, j=right+1;
        int p = (int)Math.random()*(right-left+1)+left;
        swap(array,left, p);
        int x = array[left];
        
        while(true) {
            while(i<right && array[++i] < x);
            while(j>left && array[--j] > x);
            if(i > j) {
                break;
            }
            swap(array,i,j);
        }
        return j;
    }
    
    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	int sum = scanner.nextInt();
    	int array[] = new int[n];
    	for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
        System.out.println(Test2.getCount(n,sum,array));
    }  
}