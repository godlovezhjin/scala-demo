package com.zhjin.test;

import java.util.HashMap;
import java.util.Map;

public class Test {
    //统计每个字母的个数
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap();
        String sentence = "AAABBBBBCCCDDDDE";
        char[] cs = sentence.toCharArray();
        for (char c : cs) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("map = " + map);
    }
}
