package com.arya.multithreading.thread;

public class Print implements Runnable {
	String msg;

	public Print(String msg) {
		super();
		this.msg = msg;
	}

	public void run() {
		System.out.println("Hello " + msg);
	}

}
