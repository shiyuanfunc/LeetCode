package com.simple01;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Song Yinghui
 * @date 2019/12/4
 * @Version 1.0
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
 */
public class ISValid {


    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty() || stack.pop() != map.get(s.charAt(i))) {
                    return false;
                }
            }
        }
        if (stack.empty())
            return true;
        return false;
    }

    //牛批
    public static boolean isValid2(String s) {
        char[] array = new char[s.length()];
        int i=0;
        for(char c:s.toCharArray()){
            if(c=='{'){ array[i] = '}'; i++; continue;}
            if(c=='['){ array[i] = ']'; i++; continue;}
            if(c=='('){ array[i]=')';i++;continue;}

            if(i>0&&c==array[i-1]){
                i--;
            }else{
                return false;
            }
        }
        return i==0;
    }
    public static void main(String[] args) {
        System.out.println(isValid2("(){[]}"));
    }
}
