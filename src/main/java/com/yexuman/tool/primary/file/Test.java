package com.yexuman.tool.primary.file;

import com.google.common.collect.Lists;

import java.io.File;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        File file =new File("F:\\yxm\\面试\\02-后端开发常问面试题集锦(算法问题)");
        findFileList(file);
    }
    public static void findFileList(File dir) {
        List<String> fileNames = Lists.newArrayList();
        // 判断是否存在目录
        if (!dir.exists() || !dir.isDirectory()) {
            return;
        }
        File[] files = dir.listFiles();// 读取目录下的所有目录文件信息
        for (File file : files) {
            String name = file.getName();
            if (name.contains("02-")){
                file.renameTo(new File("F:\\yxm\\面试\\02-后端开发常问面试题集锦(算法问题)\\" + name.replace("02-", "")));
            }
            System.out.println(name);
        }
    }
}
