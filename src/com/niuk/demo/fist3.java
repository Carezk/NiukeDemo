package com.niuk.demo;

/**    
* @author zk  
* @date 2018年8月16日  
*/
public class fist3 {
       public static class MyThread extends Thread {
		      
    	   public MyThread(String name) {
			super(name);
		}
    	   public MyThread(ThreadGroup group ,String name) {
                        super(group,name);    		   
		}
    	   @Override
    	   public void run() {
    		   System.out.println(getName());
    	   }
	}
	public static void main(String[] args) {
           ThreadGroup tGroup = new ThreadGroup("MyThread_Group");
           MyThread t1 = new MyThread(tGroup, "t1");
           MyThread t2 = new MyThread(tGroup, "t2");
           t1.start();
           t2.start();
           System.out.println(tGroup.activeCount());
           tGroup.list();
	}
}
