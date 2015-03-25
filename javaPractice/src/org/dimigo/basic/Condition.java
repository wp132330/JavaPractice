package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 15;
		String car="경 차";
		int money = 0;
		
		switch(car){
		case "고속버스":
			money = 850+((distance-1)/10)*300;
			break;
		case "경 차":
			money = 300+((distance-1)/10)*200;
			break;
		case "그 외":
			money = 600+((distance-1)/10)*200;
			break;
		}
		
	
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 : "+distance+"Km");
		System.out.println("차종 : "+car);
		System.out.println("통행료 : "+money+"원");
	}
}