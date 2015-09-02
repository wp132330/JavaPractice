package org.dimigo.abstractclass;

public abstract class SmartPhone {

	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
		
	}
	
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnon(){
		System.out.println(model+"의 전원을 킵니다");
	}
	
	public void turnoff(){
		System.out.println(model+"의 전원을 끕니다");
	}
	
	public void pay(){
		
	}
	
	
	public void useSpecialFunction() {
		if (this == null) return;
		else if (this instanceof IPhone) {
		IPhone i = (IPhone)this;
		
		i.useAirDrop();
		
		}
		else if (this instanceof Galaxy) {
			Galaxy g = (Galaxy)this;
			g.useWirelessCharging();
			}
		}
	
	public String toString() {
		return "모델명 : " + model +", 제조사 : " + company + ", 가격 : " + String.format("%,d", price);
	}
}
