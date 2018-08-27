package com.niuk.demo;

import java.util.LinkedList;

/**    
 * @author zk  
 * @date 2018年8月10日  
 */
public class Thread_01 {
       public synchronized static void showValue() {
	
    	   try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(Thread.currentThread().getName()+"  check");   
	}
       public synchronized static  void getValue() {
		System.out.println("check");
	}
       public static void main(String[] args) {
		final Thread_01 check = new Thread_01();
		final Thread_01 check2 = new Thread_01();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				check.showValue();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
                   
				check2.getValue();
			}
		});
		
		t1.start();
		t2.start();
	}
}
