package com.atmaekus.excer;

/**   测试文档
 * @author maekus
 * @create 2020-11-29 22:28
 */
public class BankTest {
    public static void main(String[] args) {
        //连续操作
        Bank bank = new Bank();
        bank.addCustomer("jane","Smith");
        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(100);
    }
}
