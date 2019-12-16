package com.qax.hello.tool;

/**
 * @author yexuman
 * @date 2019/10/25 17:03
 */
public class JvmArguement {
    public static void main(String[] args) {
        Runtime.getRuntime();             //单例模式
        //byte
        System.out.println("maxMemory："+byteToM(Runtime.getRuntime().maxMemory()));   //整体电脑的1/4
        System.out.println("totalMemory："+byteToM(Runtime.getRuntime().totalMemory()));  //整体电脑的1/16

        //伸缩空间 ：maxMemory   -  totalMemory
    }
    public static double byteToM(long num){
        return  num/1024/1024;
    }
}
