package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-22 17:37
 */
//���鳣���㷨��ϰ
//    ����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ�һЩ���������
//            Ȼ���������Ԫ�ص����ֵ����Сֵ����ֵ��ƽ��ֵ�������������
//            Ҫ�����������������λ����

public class ArrayExcer {
    public static void main(String[] args) {
        //��������
        int[] arr = new int[10];

        //��ֵ
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (89 + 1) + 10);          //[10,99]
        }
        //��ӡ����
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // ���������ֵ
        int MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]) {
                MaxValue = arr[i];
            }
        }
        System.out.println("���ֵΪ��" + MaxValue);

        //����Сֵ
        int MinValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MinValue > arr[i]) {
                MinValue = arr[i];
            }
        }
        System.out.println("��СֵΪ��" + MinValue);

        //��Ԫ���ܺ�
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("�ܺ�Ϊ:"+sum);

        //ƽ����
        int avgValue = sum/arr.length;
        System.out.println("ƽ����Ϊ:"+avgValue);

    }
}
