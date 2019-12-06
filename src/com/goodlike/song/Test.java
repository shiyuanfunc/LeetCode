package com.goodlike.song;

import java.math.BigDecimal;
import java.util.*;

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

        byte[] decode = Base64.getDecoder().decode("aHVjaGFuLnpqeEBhbGliYWJhLWluYy5jb20=");

        System.out.println(new String(decode));

        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("abc","efg","测试一下","2","2","3","4"));

        //会报错
//        for (String str : list){
//            if ("2".equals(str)){
//                list.remove(str);
//            }
//        }

        //list remove之后 会即时生效,list.size()会变减一，而a仍然会加1，因此会造成改元素的下一个元素被忽略
//        for (int a = 0 ; a < list.size(); a++){
//            if ("2".equals(list.get(a))){
//                list.remove(a);
//            }
//        }

        //Iterator 内部维护了一个游标cursor保存当前调用的数据位置下标，调用next()方法时，会使cursor加1，
        // 调用Iterator.remove()方法时，不会增加cursor的值，因此即时删除list元素，list.size()减一，因为cursor并未增加，因此可以正常删除。
        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            if ("2".equals(next)){
//                iterator.remove();
//            }
//        }

        //仿照Iterator 实现
        int b = 0;
        while (b < list.size()){
            if ("2".equals(list.get(b))){
                list.remove(b);
                continue;
            }
            b++;
        }
        list.forEach(System.out::println);
    }
}
