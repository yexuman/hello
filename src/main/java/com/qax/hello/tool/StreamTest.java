package com.qax.hello.tool;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author yexuman
 * @date 2019/11/4 14:56
 */
public class StreamTest {

    public static void main(String[] args) {

//        for (int i = 1; i < 30; i++) {
//            if (i <= 10) {
//                list.add(i + "a");
//            } else if (i <= 20) {
//                list.add(i + "b");
//            } else {
//                list.add(i + "c");
//            }
//        }
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            list.add(i + "");
        }
        List<String> list2 = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            list2.add(i + "");
        }

        res.add(list);
        res.add(list2);
        List<Stream<String>> collect1 = res.stream()
                .map((li -> li.stream().map(s -> s + "处理")))
                .collect(Collectors.toList());
        List<String> collect2 = res.stream().flatMap(li -> li.stream().map(s -> s + "处理")).collect(Collectors.toList());
        System.out.println(111);


        List<Integer> list3 = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            list3.add(i);
        }

        int maxRes = list3.stream().max((o1,o2)-> o1.compareTo(o2)).get();
        System.out.println(maxRes);



        //list = list.stream().filter(e -> e.endsWith("a")).collect(Collectors.toList());
        list = list.stream().map(e -> e + "ccc").collect(Collectors.toList());
        System.out.println("*****************************");
        list.forEach(System.out::println);


    }
}
