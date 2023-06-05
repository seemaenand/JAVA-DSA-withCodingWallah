package Lecture7;

import java.util.Scanner;

public class printABCD {
	
	public static void printAlpha(char start, char end) {
		//base case

		if (start > end) {
			return;
		}
		
		System.out.println(start);
		printAlpha((char)(start+1), end);
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Alphabets to be printed from");
		
		char ch = s.nextLine().charAt(0);
		
		System.out.println("Alphabets to be printed till");
		
		char ch1 = s.nextLine().charAt(0);
		
		printAlpha(ch, ch1);
		
	}

}
