package com.niuk.demo;

import java.util.Scanner;

//给出两个字符串（可能包含空格）,找出其中最长的公共连续子串,输出其长度。
public class ggzichuan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
			getMaxStirng(str1, str2);
	         
	}
	static void getMaxStirng(String str1,String str2){
 	   //依次递减查找
 	   for(int i = 0 ; i<str2.length() ; i++){
 		   for(int y = 0 ,z = str2.length()-i;z!=str2.length()+1;z++,y++){
 			   String str = str2.substring(y,z);
 			   if(str1.contains(str)){
 				  System.out.println(str);
 				  System.exit(0);
 			   }
 		   }
 	   }
    }
}
