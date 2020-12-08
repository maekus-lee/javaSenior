package com.atmaekus.excer.superexer;

/**
 * @author maekus
 * @Description
 * @create 2020-12-07-23:33
 */
public class CheckAccount extends Account{
    private double overdradt;

    public CheckAccount(double overdradt) {
        this.overdradt = overdradt;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdradt) {
        super(id, balance, annualInterestRate);
        this.overdradt = overdradt;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=getBalance()){
//            super.withdraw(amount);  方式一
            setBalance(getBalance()-amount);  //方式二
        }else if(overdradt>=amount-getBalance()){  //透支额度+余额足够消费
            overdradt = amount - getBalance();

            setBalance(0);
        }
        else{
            System.out.println("超过可透支限额");
        }
    }
}
