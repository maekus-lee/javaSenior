package com.atmaekus.excer.extend;

/**
 * @author maekus
 * @Description
 * @create 2020-12-07-21:40
 */
public class Cylinder extends Circle{
    private double length;

    Cylinder(){
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolum(){
        //System.out.println("Ìå»ýÎª£º"+findArea()*length);
        return findArea()*length;
    }
}
