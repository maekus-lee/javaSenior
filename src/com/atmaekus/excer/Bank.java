package com.atmaekus.excer;

/**
 * @author maekus
 * @create 2020-11-29 21:48
 */
public class Bank {
    private Customer[] customers;   //存放多个客户的数组  属于对象数组
    private int numberOfCustomer;   // 记录客户的个数

    public Bank() {
        customers = new Customer[10];
    }

    //添加客户
    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        customers[numberOfCustomer] = cust;
        numberOfCustomer++;
    }

    //获取客户的个数
    public int getNumOfCustomers() {
        return numberOfCustomer;
    }

    //获取指定位置的客户，返回Customer的属性
    public Customer getCustomer(int index) {
        //return customers[index];
        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        } else {
            return null;
        }
    }
}
