package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread t1 = new Runner("홍길동");
		Thread t2 = new Runner("홍길순");
		
		t1.start();
		t2.start();
		
		
		
	}

}
