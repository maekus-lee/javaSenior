package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-21 21:27
 */
/*
九九乘法表
1*1=1
2*1=2 2*2=4
 */
public class NianNianTable {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
