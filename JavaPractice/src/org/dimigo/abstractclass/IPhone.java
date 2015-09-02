package org.dimigo.abstractclass;

public class IPhone extends SmartPhone {
	

	public IPhone(){
		
	}
	
	public IPhone(String model, String company, int price){
		super(model,company,price);
	}
	
	
	public void useAirDrop(){
		System.out.println("AirDrop을 사용합니다");
	}

	@Override
	public void pay() {
		System.out.println("애플 페이로 사용합니다");
	}
	
	
}
