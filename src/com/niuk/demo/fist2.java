package com.niuk.demo;

/**    
* @author zk  
* @date 2018年8月16日  
*/
public class fist2 {
          
	private static int number;
	private static boolean ready;
	public static class MyThread extends Thread{
		@Override
		public void run(){
			while(!ready);
			System.out.println(number);
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
           new MyThread().start();
           Thread.sleep(2000);
           number = 100;
           ready = true;
           Thread.sleep(2000);
	}

}
