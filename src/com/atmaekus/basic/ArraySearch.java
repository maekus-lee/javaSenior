package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-23 20:48
 */
public class ArraySearch {
    public static void main(String[] args) {
        String[] arr = {"AA", "BB", "CC", "DD", "EE"};

        //线性查找
        String dest = "mm";
        boolean isFlag = true;

        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                isFlag = false;
                System.out.println("找到了指定的元素，位置是" + i);
                break;
            }
        }
        if(isFlag){
            System.out.println("未找到");
        }

        //二分查找
        //前提 查找的数据必须是有序的
        int[] arr1 = new int[] {-90,-88,-34,1,3,46,77,99};
        int dest1 = 3;  //查找对象
        int head = 0;  //初始索引值
        int end = arr1.length-1;  //末尾索引值
        while(head<=end){
            int middle = (head+end)/2;  //中间值
            if(arr1[middle]==dest1){
                System.out.println("查找到了，下标为："+middle);
                break;
            }
            else if(arr1[middle]>dest1){
                end = middle-1;
            }
            else if(arr1[middle]<dest1){
                head =middle+1;
            }
        }


    }
}
