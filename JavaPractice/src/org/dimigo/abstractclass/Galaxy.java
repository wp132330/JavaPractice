package org.dimigo.abstractclass;

public class Galaxy extends SmartPhone {
	
	public Galaxy(){
		
	}
	
	public Galaxy(String model, String company, int price){
		super(model,company,price);
	}
	

	public void useWirelessCharging(){
		System.out.println("무선 충전을 시작합니다");
	}

	@Override
	public void pay() {
		System.out.println("삼성페이로 결제합니다");
	}



	
	
}
