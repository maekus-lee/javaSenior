package com.atmaekus.javastudy;
import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
		System.out.println("请输入第一个数");
		Scanner scan=new Scanner(System.in);
		
		int m=scan.nextInt();
		
		System.out.println("请输入第二个数");
		int n=scan.nextInt();
		
		//接下来求最大公约数和最小公倍数
		//求m和n中的较小值
		int min=(m<=n)?m:n;
		for(int i=min;i>=1;i--) {
			if(m%i==0&&n%i==0) {
				System.out.println("最大公约数为"+i);
				break;  //查找到最大的公约数
			}
		}
		//获取最小公倍数
		int max=(m>=n)?m:n;
		for(int i=m;i<=m*n;i++) {
			if(i%m==0&&i%n==0) {
				System.out.println("最小公倍数为"+i);
				break;
			}
		}
	}
}
