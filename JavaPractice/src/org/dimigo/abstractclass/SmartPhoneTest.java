package org.dimigo.abstractclass;

public class SmartPhoneTest {

public static void main(String[] args) {
	

SmartPhone[] phones = {
		new IPhone("iPhone","애플",7000000),
		new Galaxy("갤럭시 s6","삼성",65000)
	};

for(SmartPhone phone : phones){
	System.out.println(phone);
	phone.turnon();
	phone.pay();
	
	phone.useSpecialFunction();
	
	phone.turnoff();
	System.out.println();
	}

	}
}




