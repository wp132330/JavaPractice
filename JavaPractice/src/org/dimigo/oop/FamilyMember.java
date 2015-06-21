package org.dimigo.oop;

public class FamilyMember {

	private static int memberCnt;
	private String MemberName;
	
	public FamilyMember(String MemberName){
		this.MemberName = MemberName;
		memberCnt++;
	}

	public String getMemberName() {
		return MemberName;
	}

	public static void printMemberCnt(){
		System.out.println("가족 총 인원 수:"+memberCnt+"명");
	}
	
	
}
