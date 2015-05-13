package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String answer = "오오하시 아야카";
		System.out.println("가장 좋아하는 성우는?");
		String answer1 = scanner.nextLine();
		
		if("오오하시 아야카".equalsIgnoreCase(answer1) ){
			System.out.println("정답입니다!!");
		}else{
			System.out.println("틀렸습니다!!");
		}
		
		String answere = "Boy A"; 
		System.out.println("가장 좋아하는 영화는?");
		String answer2 = scanner.nextLine();
		
		if("Boy A".equalsIgnoreCase(answer2) ){
			System.out.println("정답입니다!!");
		}else{
			System.out.println("틀렸습니다!!");
		}
		
		String answered = "No pain No game"; 
		System.out.println("가장 좋아하는 음악은?");
		String answer3 = scanner.nextLine();
		
		if("No pain No game".equalsIgnoreCase(answer3) ){
			System.out.println("정답입니다!!");
		}else{
			System.out.println("틀렸습니다!!");
		}

	}

}
