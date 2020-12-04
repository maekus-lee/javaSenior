package com.atmaekus.basic;

/**
 * @author maekus
 * @create 2020-11-21 22:46
 */
public class FamilyAccount {
    public static void main(String[] args) {
        //实现菜单显示
        boolean isFlag = true;
        String detail = "收支\t账户金额\t\t收支金额\t\t说    明\n";
        int balance = 10000;
        while (isFlag) {
            System.out.println("-----------------家庭收支记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出\n");
            System.out.print("                     请选择(1-4)：");
            //接收用户输入的选择
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(detail);
                    System.out.println("--------------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int moneyin = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String note1 = Utility.readString();

                    balance += moneyin;
                    detail += "收入\t"+balance+"\t\t"+moneyin+"\t\t\t"+note1+"\n";
                    System.out.println("---------------------登记完成---------------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int moneyout = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String note = Utility.readString();

                    balance -= moneyout;
                    detail += "支出\t"+balance+"\t\t"+moneyout+"\t\t\t"+note+"\n";
                    System.out.println("---------------------登记完成---------------------");
                    break;
                case '4':    //退出功能
                    System.out.print("确认是否退出(Y/N)：");
                    char res = Utility.readConfirmSelection();
                    if (res == 'Y') {
                        isFlag = false;
                    }
                    break;
                default:
                    System.out.println("选择错误，请重新输入");
                    break;
            }
        }
    }
}
