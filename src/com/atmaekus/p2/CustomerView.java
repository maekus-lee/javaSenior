package com.atmaekus.p2;

import javax.sound.midi.SoundbankResource;

/**
 * @author maekus
 * @description
 * @create 2020-12-05-22:31
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10); // 构建10个客户对象的CustomerList 对象
    public void enterMainMenu(){
        /**
         * 用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。
         */
        boolean isFlag = true;
        while(isFlag){
            System.out.println("-----------------客户信息管理软件-----------------");
            System.out.println();
            System.out.println("\t\t1 添 加 客 户\n");
            System.out.println("\t\t2 修 改 客 户\n");
            System.out.println("\t\t3 删 除 客 户\n");
            System.out.println("\t\t4 客 户 列 表\n");
            System.out.println("\t\t5 退\t出\n");
            System.out.println("     请选择（1-5）");
            char i=CMUtility.readMenuSelection();
            switch (i){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    deleteCustomer();
                    break;
                case '3':
                    modifyCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("退出");
                    System.out.println("确认是否退出（Y/N）");
                    char isExit = CMUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }
    }
    private void addNewCustomer(){
        /**
         * 添加客户
         */
        System.out.println("-----------添加客户--------------");
        System.out.println("姓名：");
        String name = CMUtility.readString(10);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(13);
        System.out.println("邮箱");
        String email = CMUtility.readString(30);

        //将上述数据封装到对象中
        Customer customer = new Customer(name,gender,age,phone,email);

        //判断是否添加成功
        boolean isSuccess = customerList.addCustomer(customer);
        if(isSuccess == true){
            System.out.println("------添加成功-------");
        }else{
            System.out.println("------客户目录已满，添加失败-------");
        }

    }
    private void modifyCustomer(){
        /**
         * 修改客户
         */
        System.out.println("-------修改客户---------");
        for(;;){
            System.out.println("请修改客户的编号（-1退出）");
            int number = CMUtility.readInt();
            if(number == -1){
                return;
            }
            Customer cust = customerList.getCustomer(number-1);
        }



    }
    private void deleteCustomer(){
        /**
         * 删除客户
         */
    }
    private void listAllCustomers(){
        /**
         * 客户列表
         */
        int total = customerList.getTotal();
        if(total == 0){
            System.out.println("没有客户记录");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
            Customer[] customers = customerList.getAllCustomers();
            for(int i=0;i<customers.length;i++){
                //遍历数组中的信息
                Customer customer = customers[i];
                System.out.println((i+1)+"\t"+customer.getName()+"\t"+customer.getGender()+"\t"+
                        customer.getAge()+"\t"+customer.getPhone()+"\t"+customer.getEmail());
            }
        }
    }
    public static void main(String[] args){
        /**
         * 用途：创建CustomerView实例，并调用 enterMainMenu()方法以执行程序。
         */
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
