package com.goodlike.song.repeatnumber;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 去除数组中重复的数字
 *  数组中的数字 仅在1-n之间
 *   n 为数组长度
 */
public class RepeatNumber {

    public void repeatNumber(List<Integer> list){
        int length = list.size();
        int[] result = new int[length];
        list.forEach(item -> result[item] ++ );
        for(int i = 0 ; i < result.length ; i ++){
            System.out.println("元素:"+i+" ,次数:"+result[i]);
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add( 1 );
        list.add( 6 );
        list.add( 2 );
        list.add( 4 );
        list.add( 5 );
        list.add( 1 );
        list.add( 2 );

        RepeatNumber repeatNumber = new RepeatNumber();
        repeatNumber.repeatNumber( list );
    }
}
