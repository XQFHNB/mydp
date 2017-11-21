package com.xqf.pattern.strategy;

/**
 * Created by XQF on 2017/11/21.
 */
public abstract class OpeationStrategy {

    abstract double getResult(double numa, double numb);
}

class StrategyPlus extends OpeationStrategy {

    @Override
    public double getResult(double numa, double numb) {
        return numa + numb;
    }
}

class StrategySub extends OpeationStrategy {

    @Override
    public double getResult(double numa, double numb) {
        return numa - numb;
    }
}

class StrategyMutiply extends OpeationStrategy {
    @Override
    public double getResult(double numa, double numb) {
        return numa * numb;
    }
}

class StrategyDivide extends OpeationStrategy {
    @Override
    public double getResult(double numa, double numb) {
        return numa / numb;
    }
}
