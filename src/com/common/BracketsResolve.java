package com.common;

import java.util.Stack;

/**
 * @Author SHI YUAN
 * @DATE 2022/4/9 8:02 AM
 * @Version 1.0
 * @Desc
 * 给出一个正整数n，请给出所有的包含n个'('和n个')'的字符串，使得'('和')'可以完全匹配。
 * 例如：
 * '(())()'，'()()()' 都是合法的；
 * '())()('是不合法的。
 * 请按照__字典序__给出所有合法的字符串。
 */
public class BracketsResolve {

    public static boolean checkIsValid(char[] s){
        if (s[0] != '('){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            char temp = s[i];
            if (temp == '('){
                stack.push(temp);
            }else if (temp == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()()()(";
        char[] chars = str.toCharArray();
        System.out.println(checkIsValid(chars));
    }
}
