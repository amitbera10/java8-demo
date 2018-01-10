package com.java8.demo;

public class MainLamda {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread-1 is running...");
			}
		});

		Thread t2 = new Thread(() -> System.out.println("Thread-2 is running..."));

		t1.start();
		t2.start();
		
	}
}
