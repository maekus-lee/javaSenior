package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-21 22:46
 */
public class FamilyAccount {
    public static void main(String[] args) {
        //ʵ�ֲ˵���ʾ
        boolean isFlag = true;
        String detail = "��֧\t�˻����\t\t��֧���\t\t˵    ��\n";
        int balance = 10000;
        while (isFlag) {
            System.out.println("-----------------��ͥ��֧�������-----------------\n");
            System.out.println("                   1 ��֧��ϸ");
            System.out.println("                   2 �Ǽ�����");
            System.out.println("                   3 �Ǽ�֧��");
            System.out.println("                   4 ��    ��\n");
            System.out.print("                     ��ѡ��(1-4)��");
            //�����û������ѡ��
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
                    System.out.println(detail);
                    System.out.println("--------------------------------------------------");
                    break;
                case '2':
                    System.out.print("���������");
                    int moneyin = Utility.readNumber();
                    System.out.print("��������˵����");
                    String note1 = Utility.readString();

                    balance += moneyin;
                    detail += "����\t"+balance+"\t\t"+moneyin+"\t\t\t"+note1+"\n";
                    System.out.println("---------------------�Ǽ����---------------------");
                    break;
                case '3':
                    System.out.print("����֧����");
                    int moneyout = Utility.readNumber();
                    System.out.print("����֧��˵����");
                    String note = Utility.readString();

                    balance -= moneyout;
                    detail += "֧��\t"+balance+"\t\t"+moneyout+"\t\t\t"+note+"\n";
                    System.out.println("---------------------�Ǽ����---------------------");
                    break;
                case '4':    //�˳�����
                    System.out.print("ȷ���Ƿ��˳�(Y/N)��");
                    char res = Utility.readConfirmSelection();
                    if (res == 'Y') {
                        isFlag = false;
                    }
                    break;
                default:
                    System.out.println("ѡ���������������");
                    break;
            }
        }
    }
}
