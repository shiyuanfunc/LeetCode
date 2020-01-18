package com.normal.str;

import java.util.stream.Stream;

/**
 * @author Song Yinghui
 * @date 2020/1/18
 * @Version 1.0
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 */
public interface ReverseString {

    static char[] resolve(char[] s){
        int i = 0 ;
        int j = s.length - 1 ;
        while (i < j){
            char temp = s[i] ;
            s[i] = s[j];
            s[j] = temp ;
            i++;
            j--;
        }
        return s ;
    }

    static void test(int num){
        System.out.println(num);
    }
    public static void main(String[] args) {
        char[] str = new char[]{'h','e','l','l','o'};
//        char[] resolve = resolve(str);
//        Stream.of(resolve).forEach(System.out::println);
    }
}
