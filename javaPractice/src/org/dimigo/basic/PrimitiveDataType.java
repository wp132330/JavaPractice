package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String ch1 ="아이유";
		boolean male = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char blood = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름:"+ch1);
		System.out.print("성별:");
		if (male) {
			System.out.println("남자");
		}else {
				System.out.println("여자");
			}
		System.out.println("나이:"+age+"세");
		System.out.println("키:"+ height+"cm");
		System.out.println("몸무게:"+weight+"kg");
		System.out.print("혈액형:"+blood+"형");
		
		
		
			
	}
	

}
