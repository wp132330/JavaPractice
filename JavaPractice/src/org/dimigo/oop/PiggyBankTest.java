package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
	
		FamilyMember[] memberName = {
				new FamilyMember("아빠"),new FamilyMember("엄마"),new FamilyMember("나"),new FamilyMember("남동생")
		};
		
		PiggyBank piggy = new PiggyBank();
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(memberName[0], 10000);
		PiggyBank.putMoney(memberName[1], 5000);
		PiggyBank.putMoney(memberName[2], 2000);
		PiggyBank.putMoney(memberName[3], 1000);
		
		piggy.printBalance();
		
		PiggyBank.putMoney(memberName[2], 1000);
		
		piggy.printBalance();
		
		
		
	}

}
