package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		int Kor = scanner.nextInt();
		System.out.println("수학점수 : ");
		int Mat = scanner.nextInt();
		System.out.println("영어점수 : ");
		int Eng = scanner.nextInt();
		int Sum = Kor + Mat + Eng;
		String average = String.format("%.1f", (Kor + Mat + Eng)/3.0f );
		
		StringBuilder sb = new StringBuilder();
		sb.append("<<점수 출력>>\n")
			.append("국어점수:")
			.append(Kor)
			.append("점\n")
			.append("수학점수:")
			.append(Mat)
			.append("점\n")
			.append("영어점수")
			.append(Eng)
			.append("점\n")
			.append("총점:")
			.append(Sum)
			.append("점\n")
			.append("평균:")
			.append(average)
			.append("점\n");
		
		System.out.println(sb);

	}

}
