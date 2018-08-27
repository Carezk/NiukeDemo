package com.niuk.demo;

/**    
* @author zk  
* @date 2018年8月16日  
*/

class MyThread extends Thread{
	@Override
	public void run(){
		while(true){
			System.out.println("Thread running");
			if(Thread.currentThread().isInterrupted()){
				System.out.println("interrput");
				break;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("when sleep interrupt");
				Thread.currentThread().interrupt();
			}
			System.out.println("Thread end");
		}
	}
}
 
public class fist{
	public static void main(String args[]) throws InterruptedException{
		Thread t1 = new MyThread();
		t1.start();
		Thread.sleep(1000);
		t1.interrupt();
	}
}
