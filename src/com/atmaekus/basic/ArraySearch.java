package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-23 20:48
 */
public class ArraySearch {
    public static void main(String[] args) {
        String[] arr = {"AA", "BB", "CC", "DD", "EE"};

        //���Բ���
        String dest = "mm";
        boolean isFlag = true;

        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                isFlag = false;
                System.out.println("�ҵ���ָ����Ԫ�أ�λ����" + i);
                break;
            }
        }
        if(isFlag){
            System.out.println("δ�ҵ�");
        }

        //���ֲ���
        //ǰ�� ���ҵ����ݱ����������
        int[] arr1 = new int[] {-90,-88,-34,1,3,46,77,99};
        int dest1 = 3;  //���Ҷ���
        int head = 0;  //��ʼ����ֵ
        int end = arr1.length-1;  //ĩβ����ֵ
        while(head<=end){
            int middle = (head+end)/2;  //�м�ֵ
            if(arr1[middle]==dest1){
                System.out.println("���ҵ��ˣ��±�Ϊ��"+middle);
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
