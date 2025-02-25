package com.atmaekus.excer.superexer;

/**
 * @author maekus
 * @Description
 * @create 2020-12-07-23:17
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public  Account(){

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }

    public void withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
        }else {
            System.out.println("余额不足");
            System.out.println("您的余额为："+this.balance);
        }
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("您的余额为"+this.balance);
        System.out.println("月利率为："+getMonthlyInterest());
    }

}
