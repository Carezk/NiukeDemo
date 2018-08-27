package com.niuk.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class demoColl {

	public void test() {
		System.out.println("ÇëÊäÈë: ");
		StringBuffer sbf = new StringBuffer();//ºÏ²¢×Ö·û´®
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			if (input.equals("end")) {
				break;
			}
			sbf.append(input);
		}
		String str = sbf.toString();
		char[] str2 = str.toCharArray();
		TestMap(str2);
	}
	
	public void TestMap(char[] str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length; i++) {
			Integer value = map.get(str[i]);
			if (value==null) {
				map.put(str[i], 1);
			}else {
				map.put(str[i], value+1);
			}
		}
		StringBuilder sb = new StringBuilder();
		 
		Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<Character,Integer>> it = entrySet.iterator();
 
		while(it.hasNext()){
			Map.Entry<Character,Integer> me = it.next();
			sb.append(me.getKey()+"("+me.getValue()+")");
		}
		System.out.println(sb.toString());
	}
	public static void main(String[] args) {
            demoColl d1 = new demoColl();
            d1.test();
	}

}
