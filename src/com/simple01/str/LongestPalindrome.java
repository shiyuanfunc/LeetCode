package com.simple01.str;

/**
 * @author Song Yinghui
 * @date 2020/1/29
 * @Version 1.0
 *  最长回文子串
 *
 */
public class LongestPalindrome {

    /**
     * 暴力，枚举所有可能得子串，然后逐个判断是否为回文子串
     * @param str
     */
    static void resolve(String str){
        if (str == null){
            return;
        }
        int max = 1 ;
        String res = "";
        for (int i = 0; i < str.length() ; i ++){
            for (int j = i + 1 ; j < str.length(); j ++){
                if (vaild(str,i , j) && (j - i + 1) > max){
                    max = j - i + 1 ;
                    res = str.substring(i, j + 1);
                }
            }
        }
        System.out.println("result size: "+max+", res:"+res);
    }
    private static boolean vaild(String str, int i, int j) {
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i ++ ;
            j -- ;
        }
        return true;
    }


    /**
     * 动态规划方式
     * d[i][i] = 1 ;
     * dp[i][j] 表示子串 s[i, j] 是否为回文子串
     * @param str todo
     */
    static void resolve2(String str){

    }

    /**
     * 中心扩散法
     * 以一个字为中心，向两边扩散，看最多有多少个字符满足回文子串
     * @param str
     */
    static void resolve3(String str){
        if (str == null || str.length() < 2){
            return;
        }

        int max = 0 ;
        String res = "";

        for (int i = 0 ; i < str.length() - 1; i ++){
            //以该点为中心，回文字数为奇数个时
            String oddStr = centerSpread(str,i,i);
            //以该点为中心，回文字数为偶数个时
            String evenStr = centerSpread(str, i, i + 1);
            String maxLen = oddStr.length() > evenStr.length() ? oddStr: evenStr ;
            if (maxLen.length() > max){
                res = maxLen ;
                max = maxLen.length();
            }
        }
        System.out.println("result size: "+max+", res:"+res);
    }

    private static String centerSpread(String str, int i, int j) {
        // i== j 时，代表奇数个

        while (i >= 0 && j < str.length()){
            if (str.charAt(i) == str.charAt(j)){
                i--;
                j++;
            }else {
                break;
            }
        }
        //注意跳出边界，当 str.charAt(i) == str.charAt(j) 时，则说明此时的i 和j 不等 ，不能取
        return str.substring(i+1, j );
    }

    public static void main(String[] args) {
        resolve("abba");
        resolve3("adasdadabddbada");
    }
}
