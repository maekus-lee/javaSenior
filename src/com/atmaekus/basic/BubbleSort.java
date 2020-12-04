package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-23 21:27
 */

//冒泡排序实现

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = new int[]{32,434,22,55,11,55,77,84,32,88};
        //冒泡排序
        for(int i=0;i<arr.length;i++){
            //外层循环遍历每个元素
            for(int j=0;j<arr.length-1-i;j++){
                //内层循环遍历外循环后面的元素
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }



        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
