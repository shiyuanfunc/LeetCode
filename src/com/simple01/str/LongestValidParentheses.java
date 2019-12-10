package com.simple01.str;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author Song Yinghui
 * @date 2019/12/10
 * @Version 1.0
 * 给定一个只包含 '(' 和 ')' 的字符串，找出 <strong>最长</strong>的包含有效括号的子串的长度
 */
public class LongestValidParentheses {

    /**
     * 求一个字符串中多少个合格的（）总数，不符合题意
     * @param s
     * @return
     */
    static int longestValidParentheses(String s) {
        int ans = 0 ;
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++){
            if ('(' == s.charAt(i)){
                stack.push(s.charAt(i));
            }
            if (')' == s.charAt(i)){
                if (!stack.isEmpty() && stack.pop() == '('){
                    ans += 2;
                }
            }
        }
        return ans;
    }

    /**
     * 失败
     * @param s
     * @return
     */
    static int longestValidParentheses2(String s){

        int[][] dp = new int[s.length()+2][s.length()+2];

        char[] chars = s.toCharArray();
        int i = 0 ;
        while (i < chars.length && chars[i] == ')'){
            i++;
        }
        for(;i < chars.length;i++){
            int ans = 0;
            for (int j = i; j < chars.length - 1;){
                int k = j;
                while (k < chars.length && chars[k] == '('){
                    k++;
                }
                if (k > j && chars[k] == ')' && chars[k - 1] == '('){
                    ans += 2;
                    k++;

                }
            }
        }
        return 0;
    }

    /**
     * 失败
     * @param s
     * @return
     */

    static int longestValidParentheses3(String s){
        int max = 0;
        int ans = 0;
        char[] chars = s.toCharArray();
        int i = 0 ;
        while (i < chars.length && chars[i] == ')' ){
            i ++;
        }
        //第一个( 的下标
        Deque<Character> deque = new ArrayDeque<>();
        for (; i < chars.length;i++ ){
            if ('(' == chars[i]){
                deque.push(chars[i]);
            }else if (!deque.isEmpty() && deque.pop() == '('){
                //匹配成功
                ans += 2;
                max = Math.max(max, ans);
            }else {
                ans = 0;
            }
        }
        return max;
    }

    /**
     * 牛逼
     * @param s
     * @return
     */
    static int longestValidParentheses4(String s){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = -1 ;
        for (int i = 0; i < s.length(); i++){
            if ('(' == s.charAt(i)){
                stack.push(i);
            }else {
                stack.pop();
                if (!stack.empty()){
                    max = Math.max(max, i - stack.peek());
                }else {
                    stack.push(i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses4("()(()((())))"));
    }
}
