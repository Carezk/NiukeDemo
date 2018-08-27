package com.jianzhi.offer;

import java.util.ArrayList;
import java.util.List;

/**    
* @author zk  
* @date 2018年8月27日  
*/
public class Duplicate {
	
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		if (length<=0) {
			return false;
		}
		List<Integer> list = new ArrayList<>();
	    for (int i = 0; i < numbers.length; i++) {
	    	if (list.contains(numbers[i])) {
	    		duplication[0] = numbers[i];
	    		 System.out.println(duplication[0]);
				return true;
			}
			list.add(numbers[i]);
		}
	    return false;
    }
	public static void main(String[] args) {
		int [] n1 = {};
		int n2[] =new int[1]; 
		new Duplicate().duplicate(n1, 7, n2);
	}
}
