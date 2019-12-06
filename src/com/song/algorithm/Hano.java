package com.song.algorithm;

/**
 * @author Song Yinghui
 * @date 2019/12/6
 * @Version 1.0
 * 汉诺塔移动
 */
public class Hano {

    /**
     *
     *  解题思路： 1、先把 前n-1个盘子移动到 中间柱
     *            2、再把 第n个盘子移动到目标柱上
     *            3、再把中间柱上的n-1个盘子移动到目标柱上
     *
     *
     * @param n  多少个盘子
     * @param from   源柱
     * @param buff   中间柱
     * @param to     目标柱
     */
    public static void hano(int n, String from , String buff, String to){

        if (n == 0) return;    //当 n == 0时，代表最后一个；
        hano(n-1, from,to,buff);
        System.out.println(String.format("%d: %s -> %s",n,from,to));  // 移动盘子
        hano(n-1,buff,from,to);
    }

    public static void main(String[] args) {
        hano(2, "a","b","c");
    }
}
