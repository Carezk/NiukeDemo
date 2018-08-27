package com.jianzhi.offer;

/**    
 * @author zk  
 * @date 2018年8月3日  
 */
public class zhishu {
    public static double Power(double base, int exponent) {
    	 double result = 1;
         if(exponent==0){
             return 1;
         }else if(exponent==1){
             return base;
         }else if(exponent<0){
             exponent = exponent*(-1);
              for(int i = 1 ; i <= exponent ; i++){
                 result *= 1/base;
             }
             return result;
         }
         else{
             for(int i = 1 ; i <= exponent ; i++){
                 result *= base;
             }
             return result;
         }
  }
    public static void main(String[] args) {
		System.out.println(Power(2, 3));
	}
}
