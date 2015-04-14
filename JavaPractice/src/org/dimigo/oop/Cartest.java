package org.dimigo.oop;

public class Cartest {

	public static void main(String[] args) {
		Car car=new Car();
		System.out.println("<<자동차 목록>>");
		
		
		car.setcompany("현대자동차");
		car.setmodel("제네시스");
		car.setcolor("검정색");
		car.setmaxSpeed(225);
		car.setprice(50000000);
		
		System.out.println("제조사명:"+car.getcompany());
		System.out.println("모델명:"+car.getmodel());
		System.out.println("색상:"+car.getcolor());
		System.out.println("최대속도:"+car.maxSpeed()+"Km");
		System.out.println("가격:"+String.format("%,d", car.price())+"Km");
		System.out.println();
		
		car.setcompany("기아자동차");
		car.setmodel("K7");
		car.setcolor("흰색");
		car.setmaxSpeed(246);
		car.setprice(40000000);
		
		System.out.println("제조사명:"+car.getcompany());
		System.out.println("모델명:"+car.getmodel());
		System.out.println("색상:"+car.getcolor());
		System.out.println("최대속도:"+car.maxSpeed()+"Km");
		System.out.println("가격:"+String.format("%,d", car.price())+"Km");
		System.out.println();
		
		car.setcompany("삼성자동차");
		car.setmodel("SM7");
		car.setcolor("회색");
		car.setmaxSpeed(200);
		car.setprice(38000000);
		
		System.out.println("제조사명:"+car.getcompany());
		System.out.println("모델명:"+car.getmodel());
		System.out.println("색상:"+car.getcolor());
		System.out.println("최대속도:"+String.format("%,d", car.maxSpeed())+"Km");
		System.out.println("가격:"+ String.format("%,d",car.price())+"Km");
		System.out.println();

	}

}
