package com.atmaekus.excer;

/**  递归方法的使用
 * 递归必须要终止条件
 * @author maekus
 * @create 2020-11-26 22:00
 */
public class Recursion {
    public static void main(String[] args) {
        Recursion test = new Recursion();
        int num = test.getSum(500);
        System.out.println(num);

        double num2 = test.getMul(10);  //这里递归之后数据特别大的时候，采用double接收轻松
        System.out.println(num2);

        int num3 = test.f(10);
        System.out.println(num3);

        int num4 = test.Fibonacci(10);
        System.out.println(num4);

        for(int i=1;i<11;i++){
            System.out.println(test.Fibonacci(i));
        }

    }
    //例一 计算1-100之间所有自然数的和
    public int getSum(int i){
        if(i==1){
            return 1;
        }
        else{
            return i+getSum(i-1);
        }
    }

    //计算n!
    public double getMul(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*getMul(n-1);
        }
    }

    //计算f(10)
    public int f(int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 4;
        }
        else{
            return 2*f(n-1)+f(n-2);
        }
    }

    //计算斐波那契数列
    // 1 1 2 3 5 8 13 21 34 55,求第N个值并打印数列
    public int Fibonacci(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    //汉诺塔计算

}
