package com.xqf.pattern.decorator;

/**
 * Created by XQF on 2017/11/22.
 */
public class TestDecorator {
    public static void main(String[] args) {

        //产生一个中国女孩对象
        Girl girlChinese = new GirlChinese();
        girlChinese.getDesc();
        //加上黑头发
        Girl girlChineseWithBlackhair = new BlackHair(girlChinese);
        //加上黑眼睛
        Girl girlChineseWithBlackhairWithBlackEye = new BlackEye(girlChineseWithBlackhair);
        girlChineseWithBlackhairWithBlackEye.getDesc();

        System.out.println("\n\n\n");
        Girl girlChinese1 = new GirlChinese();
        girlChinese1.getDesc();
        //加上黑眼睛
        Girl girlChineseWithBlackEye = new BlackEye(girlChinese);
        //加上黑眼睛
        Girl girlChineseWithBlackEyeWithBlackhair = new BlackHair(girlChineseWithBlackEye);
        girlChineseWithBlackEyeWithBlackhair.getDesc();
    }
}
