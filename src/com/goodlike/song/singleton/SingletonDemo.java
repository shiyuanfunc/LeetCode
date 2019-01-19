package com.goodlike.song.singleton;

/**
 * @author Song Yinghui
 * @date 2019/1/19
 * @Version 1.0
 * @Desc 单例
 */
public class SingletonDemo {

    private static SingletonDemo instance = null ;
    private SingletonDemo(){

    }

    static {
        instance = new SingletonDemo();
    }

    public SingletonDemo getInstance(){
        if (instance == null ){
            //理论上来说是不会走这一步
            instance = new SingletonDemo();
        }
        return instance ;
    }
}
