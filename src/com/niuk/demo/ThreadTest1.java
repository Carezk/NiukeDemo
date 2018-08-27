package com.niuk.demo;

/**    
 * @author zk  
 * @date 2018年8月7日  
 */
public class ThreadTest1 implements Runnable {
     public static void main(String[] args) {
    	 Thread h1=new Thread(new ThreadTest1(),"A");
         Thread h2=new Thread(new ThreadTest1(),"B");
         Thread h3=new Thread(new ThreadTest1(),"C");
         h1.start();
         h2.start();
         h3.start();
	}

	@Override
	public void run() {
		for(int i=0;i<10;++i){
            System.out.println(Thread.currentThread().getName()+ "运行"+i);
            if(i==3){
                System.out.println(Thread.currentThread().getName()+ "线程的礼让");
                Thread.currentThread().yield();
            }
        }
		
	}
}
