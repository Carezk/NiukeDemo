package com.jianzhi.offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zk
 * @date 2018年8月14日
 */
public class PrintMinNumber {
         
	public String PrintMinNumberq(int[] numbers) {
         
		 if (numbers==null||numbers.length==0) {
			return null;
		}
		 int len = numbers.length;
	        String[] str = new String[len];
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0; i < len; i++){
	            str[i] = String.valueOf(numbers[i]);
	        }
	       Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String s1,String s2) {
				String c1 = s1+s2;
				String c2 = s2+s1;
				return c1.compareTo(c2);
			}
		});
		for (int i = 0; i < len; i++) {
			sb.append(str[i]);
			
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		PrintMinNumber p1 = new PrintMinNumber();
		int numbers[] = {3,32,321};
		System.out.println(p1.PrintMinNumberq(numbers));
	}
}
