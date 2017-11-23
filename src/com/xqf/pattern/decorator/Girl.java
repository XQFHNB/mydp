package com.xqf.pattern.decorator;

/**
 * Created by XQF on 2017/11/22.
 */
public abstract class Girl {
    public abstract void getDesc();
}

class GirlAmerican extends Girl {

    @Override
    public void getDesc() {
        System.out.println("I am a American girl");
    }

}

class GirlChinese extends Girl {

    public GirlChinese() {
        System.out.println("I am a initial Chinese girl");

    }

    @Override
    public void getDesc() {
        System.out.println("I am a  Chinese girl");
    }

}