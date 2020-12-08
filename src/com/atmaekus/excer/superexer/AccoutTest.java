package com.atmaekus.excer.superexer;

/**
 * @author maekus
 * @Description
 * @create 2020-12-07-23:22
 */
public class AccoutTest {
    public static void main(String[] args) {
        Account acc = new Account(1122,20000,0.045);

        acc.withdraw(2500);
        acc.deposit(3000);
    }
}
