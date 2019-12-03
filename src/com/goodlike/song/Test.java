package com.goodlike.song;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Song Yinghui
 * @date 2019/1/19
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {

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

        System.out.println( 1| 8);
    }
}
