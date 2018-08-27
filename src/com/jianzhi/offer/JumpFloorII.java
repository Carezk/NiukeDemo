package com.jianzhi.offer;

/**    
 * @author zk  
 * @date 2018年8月3日  
 */
public class JumpFloorII {
       public static int test(int n) {
    	   return (int) Math.pow(2, n-1);
	}
	public static void main(String[] args) {
		System.out.println(test(3));
	}

}
