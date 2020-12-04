package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-22 10:36
 */
//数组相关的概念
public class ArrayTest {
    public static void main(String[] args) {
        //一维数组的声明和初始化
        int num = 10;
        int[] ids;   //声明
        ids = new int[]{1001, 1002, 1003};  //1.1静态初始化

        String[] names = new String[5];  //1.2动态初始化
        //注意 上面两种的初始化方式不能混用，否则会报错

        //数组的长度
        System.out.println(names.length);
        //数组的初始化值均为0，只是不同的数据类型的表现形式不一样
        //这里初始化 也可以完全按照C++的方式进行
        int test[]={5,5,4,4,4,3};

        //二维数组声明
        int[][] arr = {{1,2,3},{1,2,3}};

        //二维数组默认值
        int[][] arr1 = new int[3][3];
        System.out.println(arr1[0]);  //这里是第一个数组的地址，类似于一维数组的地址
        double[][] arr2=new double[4][];
        System.out.println(arr2[1]);   //null，因为此时数组未指定第二个元素，仅有第一行的元素，此时数组为引用性数据，为null
        System.out.println(arr2[1][1]);//报错，未初始化的部门，出现空指针
    }
}
