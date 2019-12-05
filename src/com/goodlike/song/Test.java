package com.goodlike.song;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Date;
import java.util.Deque;

/**
 * @author Song Yinghui
 * @date 2019/1/19
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {

        Deque deque = new ArrayDeque();
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        System.out.println(calendar.getTime());

        BigDecimal decimal = new BigDecimal("120");
        int i = decimal.add(new BigDecimal("12")).multiply(new BigDecimal(100L)).intValue();
        System.out.println(i);

        System.out.println(new BigDecimal(100L).add(new BigDecimal(1L)).multiply(new BigDecimal(2L)).intValue());

        System.out.println( 1| 8);

        System.out.println(new BigDecimal("88").equals(new BigDecimal(100L)));

        System.out.println(new BigDecimal(300L).divide(new BigDecimal(100L)).equals(new BigDecimal("3.0")));

        System.out.println("---");
        /**
         * equals 比较时会对比两个数的精度，及时数值一样，但是精度不一致也会false
         * compareTo 可忽略数值精度的比较，表象为只比较数值
         */
        System.out.println(new BigDecimal(3).equals(new BigDecimal("3.0")));
        System.out.println(new BigDecimal(3).compareTo(new BigDecimal("3.0")));
    }
}
