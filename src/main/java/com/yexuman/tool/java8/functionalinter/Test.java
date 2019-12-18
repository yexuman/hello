package com.yexuman.tool.java8.functionalinter;

/**
 * @author yexuman
 * @date 2019/12/18 15:09
 */
public class Test {
    public static void main(String[] args) {
        FunctionalInterDemo demo = (name, age) -> System.out.println("我叫" + name + "，我今年" + age + "岁了");
        demo.say("金庸", 99);
    }
}
