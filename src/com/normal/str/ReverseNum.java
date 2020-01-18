package com.normal.str;

/**
 * @author Song Yinghui
 * @date 2020/1/18
 * @Version 1.0
 */
public class ReverseNum {

    static int resolve(int num){
        StringBuilder sb = new StringBuilder();
        boolean flag = num > 0 ;
        while (num != 0 ){
            sb.append(Math.abs(num % 10));
            num /= 10 ;
        }
        try{
            int i = Integer.parseInt(sb.toString());
            if (!flag){
                return -i ;
            }
            return i ;
        }catch (Exception e){
            return 0 ;
        }
    }

    public static void main(String[] args) {
        System.out.println(resolve(-67672));
    }
}
