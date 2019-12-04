package com.simple01;

/**
 * @author Song Yinghui
 * @date 2019/12/4
 * @Version 1.0
 * 求多个字符串的公共前缀
 * 假设第一个字符串为公共前缀，一次与第二个求两者的公共前缀，再与第三个球公共前缀，...
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String... strs){
        if (strs.length == 0){
            return "";
        }
        String ans  = strs[0];
        for (int i = 1; i< strs.length; i++){
            int j = 0;
            for (; j<ans.length() && j < strs[i].length(); j++){
                if (ans.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            ans = ans.substring(0,j);
            if (ans.equals("")){
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix("dog","racecar","car"));
    }
}
