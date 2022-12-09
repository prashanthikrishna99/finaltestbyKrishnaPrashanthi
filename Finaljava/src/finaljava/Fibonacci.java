package finaljava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1=0, n2=1;
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("The fibonacci series is:");
		
		for(int i=1;i<=n;++i) {
			System.out.print(n1 +",");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			
			
		}
		
		
		
		
		
		

	}

}
