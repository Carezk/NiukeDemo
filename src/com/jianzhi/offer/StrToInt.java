package com.jianzhi.offer;

/**
 * @author zk
 * @date 2018年8月27日
 * 实现String.ValueOf()方法;
 */
public class StrToInt {

	public static int StrToInt(String str) {
		if (str==""||str.length()==0) {
			return 0;
		}
		char[] c = str.toCharArray();
		int fuhao = 0;
		if (c[0] =='-') {
			fuhao = 1;
		}
		int sum = 0;
		for (int i = fuhao; i < c.length; i++) {
			if (c[i]<48||c[i]>57) {
				return 0;
			}
			sum = sum*10+c[i]-48;
		}
		return fuhao == 0 ? sum : sum*-1;  
	}

	public static void main(String[] args) {
		System.out.println(StrToInt("123728"));
	}
}
