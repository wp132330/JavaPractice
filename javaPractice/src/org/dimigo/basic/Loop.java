package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		for(int a=1; a <=10;a++)
		{
			for(int b=1; b<=10; b++){
				if(b==a)
					System.out.print("*");
				else
					System.out.print(b);
			}
			System.out.println();
		}
	}

}