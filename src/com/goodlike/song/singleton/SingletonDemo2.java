package com.goodlike.song.singleton;

/**
 * @author Song Yinghui
 * @date 2019/1/19
 * @Version 1.0
 */
public class SingletonDemo2 {

    private SingletonDemo2(){

    }

    public static class SingletonHoider{
        private static SingletonDemo2 instance = new SingletonDemo2();
    }

    public SingletonDemo2 getInstance(){
        return SingletonHoider.instance;
    }
}
