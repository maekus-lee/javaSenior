package com.atmaekus.javastudy;
import java.util.Scanner;
/**
 * 
 * @Description
 * @version
 * @author maekus
 * @date 2020年11月20日下午11:02:33
 */

public class SwitchCase3 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入年份");
	int year=scan.nextInt();
	System.out.println("请输入月份");
	int month=scan.nextInt();
	System.out.println("请输入天数");
	int day=scan.nextInt();
	
	switch(month) {
	case 1:
		System.out.println("今天是"+day+"天");
		break;
	case 2:
		System.out.println("今天是"+31+day+"天");
		break;
	}
	
	}
}
