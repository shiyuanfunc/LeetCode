package com.normal.str;

/**
 * @author Song Yinghui
 * @date 2020/1/18
 * @Version 1.0
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 假定字符串中字母均为小写
 */
public class FirstUniqChar {

    static int resolve(String str){
        int[] temp = new int[26];
        for (int i = 0; i < str.length(); i++){
            temp[str.charAt(i) - 'a'] ++ ;
        }
        for (int i = 0; i < str.length(); i++){
            if (temp[str.charAt(i) - 'a'] == 1){
                return i ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        System.out.println(resolve("abdsdadasdai"));
    }
}
