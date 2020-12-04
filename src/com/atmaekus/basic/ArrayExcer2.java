package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-22 18:00
 */
//(1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，
//        他们是int[]类型的数组。
//        (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
//        (3)显示array1的内容。
//        (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
//        (如array[0]=0,array[2]=2)。打印出array1。
public class ArrayExcer2 {
    public static void main(String[] args) {
        int[] array1, array2;

        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        //打印
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        //赋值，只能称为浅拷贝，需要在堆区new一个空间进行赋值才能深拷贝
        array2 = array1;   //浅拷贝

        //int array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        //修改
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        //打印array
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        //数组的反转
        //方式一
        for (int i = 0; i < array1.length / 2; i++) {
            int temp = array1[i];
            array1[i] = array1[array1.length-i-1];
            array1[array1.length-i-1] = temp;
        }

        //方式二
        for(int i=0,j=array1.length-1;i<j;i++,j--){
            int temp = array1[i];
            array1[i] = array1[array1.length-i-1];
            array1[array1.length-i-1] = temp;
        }
        //遍历
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
