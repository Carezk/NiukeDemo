package com.niuk.demo;

/**
 * @author zk
 * @date 2018年8月7日
 */
public class ThreadTest2 implements Runnable {
	int count = 10;

	public static void main(String[] args) {
		ThreadTest2 t1 = new ThreadTest2();
		Thread h1 = new Thread(t1, "A");
		Thread h2 = new Thread(t1, "B");
		Thread h3 = new Thread(t1, "C");
		h1.start();
		//h2.start();
		//h3.start();
	}

	@Override
	public void run() {
		while (true) {
			//synchronized (this) {
				if (count <= 0) {
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("A");
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ":" + count--);
			}
		}
	//}
}
