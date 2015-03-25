package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a = 9,b=10,c = 0;
		double sum1,sum2;
		double d1 = 5.8;
		double d2 = 5.4;
		
		
		sum1 = ((a+b)*d1/2);
		sum2 = (a*d2);
		double sum3 = 0;
		if(sum1>sum2)
		{
			sum3 = sum1 - sum2;
		}
		else{
			sum1=c;
			c=(int) sum1;
			sum1=sum2;
			sum2=c;
			
			sum3 = sum1 - sum2;
			
		}
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이:"+sum1);
		System.out.println("평행사변형의 넓이:"+sum2);
		System.out.println("사다리꼴이 평행사변형보다"+sum3+"더 큽니다.");
	}

}
