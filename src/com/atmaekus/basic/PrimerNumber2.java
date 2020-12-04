package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-21 22:23
 */
//质数输出第二种方法
public class PrimerNumber2 {
    public static void main(String[] args) {
        int cont=0;
         label:for(int i=2;i<=100;i++){
             for(int j=2;j<=Math.sqrt(i);j++){
                 if(i%j==0){
                     //此时说明当前的i已经不满足要求
                     continue label;
                 }
                 }
             System.out.println(i);
             cont++;

         } System.out.println(cont);
    }
}
