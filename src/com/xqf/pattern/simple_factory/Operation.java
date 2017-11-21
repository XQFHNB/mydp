package com.xqf.pattern.simple_factory;

/**
 * 运算父类
 * Created by XQF on 2017/11/20.
 */
public abstract class Operation {
    private double numA;
    private double numB;

    public double getA() {
        return numA;
    }

    public void setA(double numA) {
        this.numA = numA;
    }

    public double getB() {
        return numB;
    }

    public void setB(double numB) {
        this.numB = numB;
    }

    public abstract double getResult();
}
