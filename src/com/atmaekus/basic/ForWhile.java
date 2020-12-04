package com.atmaekus.basic; /**
 * @author maekus
 * @create 2020-11-21 20:00
 */

import java.util.Scanner;

public class ForWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int positiveNum=0;
        int negativeNum=0;

        while(true){
            int num=scan.nextInt();
            if(num<0){
                negativeNum++;
            }
            else if(num>0){
                positiveNum++;
            }
            else{
                break;
            }
        }
        System.out.println("正数个数为："+positiveNum);
        System.out.println("负数个数为："+negativeNum);
    }
}
