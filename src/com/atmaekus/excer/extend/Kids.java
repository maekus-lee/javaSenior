package com.atmaekus.excer.extend;

/**)定义类Kids继承ManKind，并包括
 成员变量int yearsOld；
 方法printAge()打印yearsOld的值。
 * @author maekus
 * @Description
 * @create 2020-12-07-21:07
 */
public class Kids extends Mankind{
    private int yearsOld;

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println(yearsOld);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
