package com.hedian.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Desc: list 交集，差集
 * @Author: HC
 * @Since: 2021/2/25
 */
public class ListUtils {
    /**
     * 交集
     */
    public static final String LIST1_AND_LIST2 = "0";

    /**
     * 差集（list1 - list2）
     * 增量
     */
    public static final String LIST1_REMOVE_LIST2 = "1";

    /**
     * 差集（list2 - list1）
     * 删除
     */
    public static final String LIST2_REMOVE_LIST1 = "2";

    public static <T> Map<String, List<T>> getMap(List<T> list1, List<T> list2) {

        //交集
        List<T> intersection = list1.stream().filter(list2::contains).collect(Collectors.toList());

        //差集（list1 - list2）
        List<T> reduce1 = list1.stream().filter(item -> !list2.contains(item)).collect(Collectors.toList());

        //差集（list2 - list1）
        List<T> reduce2 = list2.stream().filter(item -> !list1.contains(item)).collect(Collectors.toList());

        Map<String, List<T>> map = new HashMap<>();
        map.put(LIST1_AND_LIST2, intersection);
        map.put(LIST1_REMOVE_LIST2, reduce1);
        map.put(LIST2_REMOVE_LIST1, reduce2);

        return map;
    }

//    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
//        list1.add("1111");
//        list1.add("2222");
//        list1.add("3333");
//        list1.add("4444");
//
//        List<String> list2 = new ArrayList<>();
//        list2.add("3333");
//        list2.add("4444");
//        list2.add("5555");
//        list2.add("6666");
//
//        Map<String, List<String>> map = getMap(list1, list2);
//        System.out.println(map);
//    }
}
