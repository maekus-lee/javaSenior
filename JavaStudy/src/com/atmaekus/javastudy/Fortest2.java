package com.atmaekus.javastudy;
//import java.util.Scanner;

public class Fortest2 {
	public static void main(String[] args) {
		int num=0,sum=0;
//		System.out.println("");
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				num++;
				sum+=i;
			}
		}
		System.out.println("个数为："+num);
		System.out.println("总数为："+sum);
	}
}
