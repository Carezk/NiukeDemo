package com.niuk.demo;

import java.util.Scanner;

//���������ַ��������ܰ����ո�,�ҳ�������Ĺ��������Ӵ�,����䳤�ȡ�
public class ggzichuan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
			getMaxStirng(str1, str2);
	         
	}
	static void getMaxStirng(String str1,String str2){
 	   //���εݼ�����
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
