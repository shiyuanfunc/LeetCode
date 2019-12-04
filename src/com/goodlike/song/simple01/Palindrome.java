package com.goodlike.song.simple01;

/**
 * @author Song Yinghui
 * @date 2019/12/4
 * @Version 1.0
 * 判断一个数是不是回文
 */
public class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0 ){
            return false;
        }
        int a = x ;
        int result = 0;
        while (a > 0){
            int i1 = a % 10;
            a = a/ 10;
            result = result * 10 + i1;
        }
        return result == x ;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
