package com.jianzhi.offer;

import java.util.ArrayList;
import java.util.List;

/**    
* @author zk  
* @date 2018年8月14日  
*/
public class FirstNotRepeatingChar {

	 public int FirstNotRepeatingChar1(String str) {
		 if (str==null||str.length()==0) {
			return -1;
		}
		List<Character> list = new ArrayList<>();
		     for (int i = 0; i < str.length(); i++) {
                   char ch = str.charAt(i);
		    	 if (!list.contains(ch)) {
					list.add(Character.valueOf(ch));
				}else {
					 list.remove(Character.valueOf(ch));
				}
			}
		     if (list.size()<0) {
				return -1;
			}
		     return str.indexOf(list.get(0));
	    }
	 public int FirstNotRepeatingChar2(String str) {
		 int hash[] = new int[256];
		 int len = str.length();
		 for (int i = 0; i < len; i++) {
			  char temp = str.charAt(i);
			  hash[temp]++;
		}
		 for (int i = 0; i < len; i++) {
			char temp = str.charAt(i);
			 if (hash[temp]==1) {
				return i;
			}
		}
		 return -1;
	 }
	 
	public static void main(String[] args) {
		String str = "abcacfydyhjg";
		FirstNotRepeatingChar f = new FirstNotRepeatingChar();
		System.out.println(f.FirstNotRepeatingChar2(str));
	}

}
