package com.goodlike.song;

/**
 * @author Song Yinghui
 * @date 2019/3/20
 * @Version 1.0
 */
public class ManyNumber {

    public int getIndex(int num){
        return num >> 3;
    }

    public int getPosition(int num){
        return num & 007 ;
    }

    public void add(byte[] bits, int num){
        bits[getIndex(num)] |= 1 << getPosition(num);
    }

    public static void main(String[] args) {
        //System.out.println(9 & 0x07);
        System.out.println(Integer.toBinaryString(~(1 << 1)));
        System.out.println(0 | 1 << 1);
    }
}
