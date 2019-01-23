package com.goodlike.song.day05;

import java.util.Stack;

/**
 * @author Song Yinghui
 * @date 2019/1/23
 * @Version 1.0
 * @Desc 不加前指针的情况，倒序输出链表
 */
public class ReverseOutputLinklist {

    class Linklist{
        private String data ;
        private Linklist next ;
        public Linklist(String s){
            this.data = s ;
            this.next = null ;
        }
    }

    /**
     *  递归方式
     * @param linklist
     */
    public void reverseOutputLinklist(Linklist linklist){
        if (linklist != null ){
            if (linklist.next != null){
                reverseOutputLinklist(linklist.next);
            }
            System.out.println(linklist.data);
        }
    }

    /**
     *  栈方式
     * @param linklist
     */
    public void reverseOutputLinklist2(Linklist linklist){
        Stack<String> stack = new Stack<>();
        while (linklist != null ){
            stack.push(linklist.data);
            linklist = linklist.next ;
        }

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {

        ReverseOutputLinklist reverseOutputLinklist = new ReverseOutputLinklist();
        Linklist linklist1 = reverseOutputLinklist.new Linklist("1");
        Linklist linklist2 = reverseOutputLinklist.new Linklist("2");
        Linklist linklist3 = reverseOutputLinklist.new Linklist("3");
        Linklist linklist4 = reverseOutputLinklist.new Linklist("4");
        Linklist linklist5 = reverseOutputLinklist.new Linklist("5");
        Linklist linklist6 = reverseOutputLinklist.new Linklist("6");
        Linklist linklist7 = reverseOutputLinklist.new Linklist("7");
        Linklist linklist8 = reverseOutputLinklist.new Linklist("8");
        linklist1.next = linklist2;
        linklist2.next = linklist3;
        linklist3.next = linklist4;
        linklist4.next = linklist5;
        linklist5.next = linklist6;
        linklist6.next = linklist7;
        linklist7.next = linklist8;

        reverseOutputLinklist.reverseOutputLinklist2(linklist1);
    }
}
