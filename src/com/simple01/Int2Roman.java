package com.simple01;

/**
 * @author Song Yinghui
 * @date 2019/12/4
 * @Version 1.0
 * 借鉴
 * 首先把罗马数字和阿拉伯数字的转换关系用两个数组表示，然后不断将当前数字与当前最大单位作比较，每次转换完就减去已转换的数字，再比较...直到当前数字等于0.
 */
public class Int2Roman {

    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};  // 罗马数字
        int[] arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};  // 阿拉伯数字
        int index = 0;
        while (num > 0) {
            int count = num / arab[index];
            while (count-- > 0) {
                ans.append(roman[index]);
            }
            num %= arab[index];
            index++;
        }
        return ans.toString();
    }
}
