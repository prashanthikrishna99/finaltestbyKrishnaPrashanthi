package finaljava;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== 'a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				System.out.println("The String consists of an vowel:"+" "+str.charAt(i));	
			}
			else {
				System.out.println("The string does not consist an vowel");
			}
		}
			

	}

}
