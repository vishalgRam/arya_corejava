package com.arya.multithreading.thread;

public class Display extends Thread {
	String msg;

	public Display(String msg) {
		super();
		this.msg = msg;
	}



	@Override
	public void run() {
		System.out.println("Hi" + msg);
	}
	

}
