package com.xqf.pattern;

/**
 * 测试类
 * Created by XQF on 2017/11/20.
 */
public class TestFactory {

    public static void main(String[] args) {
        Operation myOperation = OperationFactory.getOperationFromInfo('+');
        myOperation.setA(1.0);
        myOperation.setB(2.0);
        System.out.println(myOperation.getResult());
    }
}
