package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-22 16:48
 */
//杨辉三角打印
public class YangHuiTest {
    public static void main(String[] args) {
        //1 创建二维数组
        int[][] yanghui = new int[8][];   //动态创建的方式
        //2 赋值
        for(int i=0;i<yanghui.length;i++){
            yanghui[i] = new int[i+1];    //给每行的元素初始化一个数组

            //2.1给首尾元素赋值
            yanghui[i][0]=yanghui[i][i]=1;
            //2.2给非首尾部分赋值
            for(int j=1;j<yanghui[i].length-1;j++){
                yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
            }
        }
        //3 遍历
        for(int i=0;i<yanghui.length;i++){
            for(int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
