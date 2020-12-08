package com.atmaekus.excer.extend;

/**
 * @author maekus
 * @Description
 * @create 2020-12-07-21:42
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(5);
        cylinder.setLength(10);
        double volumn = cylinder.findVolum();
        System.out.println("Ìå»ıÎª£º"+volumn);
        cylinder.findArea();
    }
}
