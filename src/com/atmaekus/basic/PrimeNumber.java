package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-21 21:36
 */
//100以内所有质数
public class PrimeNumber {
    public static void main(String[] args) {
        boolean isFlag=true;
//获取当前时间距离1970-1-1 -00：00：00
        long begin=System.currentTimeMillis();

        for(int i=2;i<=100000;i++){
            for(int j=2;j<=Math.sqrt(i);j++){   //202   59
                if(i%j==0){
                    isFlag=false;
                    break;     //  9725  最终优化后为59
                }
            }
            if(isFlag==true){
                System.out.println(i);
            }
            //重置isFlag
            isFlag=true;
        }
        long end=System.currentTimeMillis();
        System.out.println("时间差为:"+(end-begin));  //925
    }
}
