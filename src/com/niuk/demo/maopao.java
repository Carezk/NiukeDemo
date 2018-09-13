package com.niuk.demo;

/**    
* @author zk  
* @date 2018年9月11日  
*/
public class maopao {

	public static void sort(int array[]) {
		int temp;
	       for (int i = 0; i < array.length; i++) {
			    for (int j = 0; j < array.length-1-i; j++) {
					 if (array[j]>array[j+1]) {
						 temp = array[j];
						 array[j] = array[j+1];
						 array[j+1] = temp;
					}
				}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[] = {1,7,4,2,5,3,9,0};
        sort(array);
        for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+"  ");
		}
	} 

}
