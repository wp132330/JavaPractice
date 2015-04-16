package org.dimigo.oop;

public class Cartest {

	public static void main(String[] args) {
		System.out.println("<<자동차 목록>>");
		
		
		//car.setcompany("현대자동차");
		//car.setmodel("제네시스");
		//car.setcolor("검정색");
		//car.setmaxSpeed(225);
		//car.setprice(50000000);
		
		//Car2 car1= new Car2("현대자동차","제네시스","검정색",225, 5000000);
		
		
		Car3 car1 = new Car3("현대자동차","제네시스","검정색",225,5000000);
		System.out.println("제조사명:"+car1.getcompany());
		System.out.println("모델명:"+car1.getmodel());
		System.out.println("색상:"+car1.getcolor());
		System.out.println("최대속도:"+car1.getmaxSpeed()+"Km");
		System.out.println("가격:"+String.format("%,d", car1.getprice())+"원");
		System.out.println();
		
		//car.setcompany("기아자동차");
		//car.setmodel("K7");
		//car.setcolor("흰색");
		//car.setmaxSpeed(246);
		//car.setprice(40000000);
		
		//Car2 car2= new Car2("기아자동차","K7","흰색",246, 4000000);
		Car3 car2 = new Car3("기아자동차","K7","흰색",246);
		System.out.println("제조사명:"+car2.getcompany());
		System.out.println("모델명:"+car2.getmodel());
		System.out.println("색상:"+car2.getcolor());
		System.out.println("최대속도:"+car2.getmaxSpeed()+"Km");
		System.out.println("가격:"+String.format("%,d", car2.getprice())+"원");
		System.out.println();
		
		//car.setcompany("삼성자동차");
		//car.setmodel("SM7");
		//car.setcolor("회색");
		//car.setmaxSpeed(200);
		//car.setprice(38000000);
		
		//Car2 car3= new Car2("삼성자동차","SM7","회색",200, 3800000);
		
		Car3 car3 = new Car3("삼성자동차","SM7","회색");
		System.out.println("제조사명:"+car3.getcompany());
		System.out.println("모델명:"+car3.getmodel());
		System.out.println("색상:"+car3.getcolor());
		System.out.println("최대속도:"+car3.getmaxSpeed()+"Km");
		System.out.println("가격:"+ String.format("%,d",car3.getprice())+"원 ");
		System.out.println();

	}

}
