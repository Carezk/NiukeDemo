package com.niuk.demo;

/**
 * @author zk
 * @date 2018年8月7日
 */
public class ThreadTest3 implements Runnable {
	int i = 1;

	public static void main(String[] args) {
		ThreadTest3 t = new ThreadTest3();
		new Thread(t, "A").start();
		new Thread(t, "B").start();
	}

	@Override
	public void run() {
		while (i<=10) {
			synchronized (this) {
				notify();// 先唤醒线程
				try {
					Thread.currentThread();
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					System.out.println(Thread.currentThread().getName() + ":"
							+ i);
					i++;
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}
	}
}
