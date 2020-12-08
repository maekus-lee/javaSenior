package com.atmaekus.excer.extend;

/**
 * @author maekus
 * @Description
 * @create 2020-12-07-21:35
 */
public class Circle {
    private double radius;

    Circle(){
        radius = 1;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
