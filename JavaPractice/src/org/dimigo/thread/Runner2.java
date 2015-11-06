package org.dimigo.thread;

import java.util.Random;

public class Runner2 implements Runnable{
	
	
	private String name;
	
	public Runner2(){
		
	}
	
	public Runner2(String name) {
		this.name = name;
	}
	
	
	public void run(){
		int race = 100;
		int min = 10;
		System.out.println(name +"출발");
		
		for(int i=1; i<=10; i++){
			System.out.println(name+""+race+"미터");
			race = race- min;
			if(race == 0){
				System.out.println(name + "골인");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
