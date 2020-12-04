package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-21 20:53
 */
//打印菱形结构
public class ForForTest {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            //输出" "
            for(int k=0;k<4-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4;i>0;i--){
            //输出" "
            for(int k=0;k<5-i;k++) {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
