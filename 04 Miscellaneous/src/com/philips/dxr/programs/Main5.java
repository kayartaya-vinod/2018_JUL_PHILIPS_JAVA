package com.philips.dxr.programs;

public class Main5 {

	static class MyThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 20; i++) {
				System.out.println("Output from Therad: " + Thread.currentThread().getName() + ": i = " + i);
				delay(250);
			}
		}
	}

	static void delay(long duration) {
		try {
			Thread.sleep(duration);
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			while (true) {
				System.out.println("Output from an endless loop");
				delay(150);
			}
		}, "EndlessLoopThread");
		t1.setDaemon(true);
		t1.start();

		MyThread mt = new MyThread();
		mt.start();
		
		Thread.yield();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Output from Therad: " + Thread.currentThread().getName() + ": i = " + i);
			delay(150);
		}
		mt.join();
		System.out.println("Done");
	}
}
