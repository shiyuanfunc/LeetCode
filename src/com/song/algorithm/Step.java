package com.song.algorithm;

/**
 * @author Song Yinghui
 * @date 2019/12/8
 * @Version 1.0
 *  一个楼梯 每次只能登一阶或者两阶台阶
 *  给一个楼层高度，问有多少种上楼方式
 */
public class Step {

    private int[] tmp = new int[10005];

    //通过数组缓存 运算时长提升好多倍
    public int step(int n){

        if (n <= 0){
            tmp[0] = 0;
        }
        if (n == 1){
            tmp[n] = 1;
        }
        if (n == 2){
            tmp[n] = 2;
        }
        if (n >= 3){
            tmp[n] = step(n-1)+step(n-2);
        }
        return tmp[n];
    }

    public int stepNoCache(int n){
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        return stepNoCache(n - 1)+ stepNoCache(n - 2);
    }


    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println(new Step().stepNoCache(45));
        long endTime  = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        long startTime1 = System.currentTimeMillis();
        System.out.println(new Step().step(45));
        long endTime1  = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);
    }
}
