package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-21 10:31
 */
public class WhileTest {
    public static void main(String[] args) {
        int i=0;
        while(i<=100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
