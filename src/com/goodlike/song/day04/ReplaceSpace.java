package com.goodlike.song.day04;


/**
 * @author Song Yinghui
 * @date 2019/1/23
 * @Version 1.0
 * @Desc 把空格转换成%20
 */
public class ReplaceSpace {

    public void replaceSpace(char[] str){
        int n = 0 ;
        for (char ch : str){
            if (ch == ' '){
                n ++ ;
            }
        }
        int ptr = str.length + 2 * n -1 ;
        char[] result = new char[ptr + 1];
        for (int i = str.length-1 ; i >= 0 ; i--){
            if (str[i] == ' '){
                result[ptr] = '0';
                result[ptr - 1] = '2';
                result[ptr - 2] = '%';
                ptr  = ptr - 2 ;
            }else {
                result[ptr] = str[i];
            }
            ptr -- ;
        }
        System.out.println(new String(result));
    }

    public static void main(String[] args) {
        char[] s = new char[]{' ','a','b',' ','c',' '};
        ReplaceSpace test = new ReplaceSpace();
        test.replaceSpace(s);
    }
}
