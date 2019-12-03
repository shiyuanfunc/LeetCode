package com.goodlike.song.singleton;

/**
 * @author Song Yinghui
 * @date 2019/1/19
 * @Version 1.0
 * @Desc 枚举方式创建单例
 */
public enum SingletonDemo3 {
    //枚举的域（field）本身就是 SingletonDemo3的实例对象
    INSTANCE;
    public SingletonDemo3 getInstance(){
        return INSTANCE ;
    }

    public void test(){
    }
}
