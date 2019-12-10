package com.simple01.str;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Song Yinghui
 * @date 2019/12/3
 * @Version 1.0
 * 求一个字符串中最长不重复子串（不是子系列）
 */
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s){

        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                //之所以采用max 防止abba，当读取到第4个字母a时，方式left再回到1
                /**
                 * 相当于定义一个窗口 窗口中只保留当前未读的且不重复度数字
                 */
                left = Math.max(left, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left +1);
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "abba";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
