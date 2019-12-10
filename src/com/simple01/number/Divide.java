package com.simple01.number;

/**
 * @author Song Yinghui
 * @date 2019/12/10
 * @Version 1.0
 *
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/divide-two-integers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Divide {

    /**
     * 时间超出限制
     * @param dividend
     * @param divisor
     * @return
     */
    public static int divide(int dividend, int divisor) {
        int ans = 0;
        boolean flag = false;
        if ((dividend > 0 && divisor > 0) ||(dividend < 0 && divisor < 0)){
            flag = true;
        }
        if (dividend> 0){
            dividend = -dividend;
        }
        if (divisor > 0){
            divisor = -divisor;
        }
        while (dividend <= divisor){
            dividend -= divisor;
            if (flag && ans < Integer.MAX_VALUE) {
                ans++;
            }
            if (!flag && ans > Integer.MIN_VALUE){
                ans --;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(divide(2147483647,2));
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
