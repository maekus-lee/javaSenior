package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-22 17:37
 */
//数组常见算法练习
//    定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
//            然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
//            要求：所有随机数都是两位数。

public class ArrayExcer {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[10];

        //赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (89 + 1) + 10);          //[10,99]
        }
        //打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 求数组最大值
        int MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]) {
                MaxValue = arr[i];
            }
        }
        System.out.println("最大值为：" + MaxValue);

        //求最小值
        int MinValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MinValue > arr[i]) {
                MinValue = arr[i];
            }
        }
        System.out.println("最小值为：" + MinValue);

        //求元素总和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("总和为:"+sum);

        //平均数
        int avgValue = sum/arr.length;
        System.out.println("平均数为:"+avgValue);

    }
}
