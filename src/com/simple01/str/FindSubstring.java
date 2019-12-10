package com.simple01.str;

import java.util.*;

/**
 * @author Song Yinghui
 * @date 2019/12/10
 * @Version 1.0
 * <p>
 * 给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 * <p>
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindSubstring {

    /**
     * 太慢
     * @param s
     * @param words
     * @return
     */
    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> list = new ArrayList<>();
        if ("".equals(s) || words.length == 0) {
            return list;
        }
        int length = words.length * words[0].length();
        for (int i = 0; i <= s.length() - length; i++) {
            List<String> temp = new ArrayList<>();
            Collections.addAll(temp, words);
            String substring = s.substring(i, i + length);
            int index = check(substring, temp);
            if (index != -1) {
                list.add(i);
            }
        }
        return list;
    }

    private static int check(String string, List<String> words) {
        if ("".equals(string) || words == null || words.isEmpty() || words.get(0).length() <= 0) {
            return 0;
        }
        boolean flag = false;
        String substring = string.substring(0, words.get(0).length());
        for (int i = 0; i < words.size(); i++) {
            if (substring.equals(words.get(i))) {
                words.remove(i);
                flag = true;
                break;
            }
        }
        if (flag) {
            if (words.isEmpty()) {
                return 0;
            }
            return check(string.substring(words.get(0).length()), words);
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> barfoothefoobarman = findSubstring("goodgoodwordgoodbestword", new String[]{"word", "good", "best", "word"});
        barfoothefoobarman.forEach(System.out::println);
    }
}
