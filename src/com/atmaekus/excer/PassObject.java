package com.atmaekus.excer;

/**
 * @author maekus
 * @create 2020-11-26 21:46
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c,5);
        System.out.println(c.radis);
    }
    public void printAreas(Circle c,int time){

        for(int i=1;i<=time;i++){
            c.radis=i;
            System.out.println(c.radis+"\t\t"+c.findArea());
        }
        c.radis++;
    }
}
