package com.atmaekus.javastudy;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		char c=word.charAt(0);
		switch(c) {
		case 'a':
			System.out.print("A");
			break;
		case 'b':
			System.out.print("B");
			break;
		case 'c':
			System.out.print("C");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
	}
}
