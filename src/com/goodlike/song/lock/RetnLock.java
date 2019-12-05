package com.goodlike.song.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Song Yinghui
 * @date 2019/12/5
 * @Version 1.0
 */
public class RetnLock {

    ReentrantLock reentrantLock = new ReentrantLock(true);
    int count = 0;
    public void test(){
        if(reentrantLock.tryLock()){
            System.out.println("----,get lock");
            try {
                Thread.sleep(2 * 1000L);
                System.out.println("lock  over ----");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void testLock(){
        /**
         * 需要抢锁时，如果没抢到锁则会阻塞等待。
         获取的锁为 ReentrantLock 对象中的锁,
         若通过线程中通过new RetnLock().testLock();方式调用，则每个线程中都会有个ReentrantLock对象，
             多个线程执行到这块代码时，并不能顺序执行，因为大家都有锁不需要去抢锁。
         */
        reentrantLock.lock();
        System.out.println("----,get lock");
        System.out.println(Thread.currentThread().getName());
        try {
            if (count < 5) {
                count++;
                Thread.sleep(2 * 1000L);
                testLock();
            }
            System.out.println("lock  over ----");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }
    }

    public static void main(String[] args) {
        RetnLock retnLock = new RetnLock();
        new Thread(()->{
            System.out.println("---111");
            retnLock.testLock();
            //new RetnLock().testLock();
        }).start();
        new Thread(()->{
            System.out.println("---222");
            retnLock.testLock();
          //  new RetnLock().testLock();
        }).start();
    }
}
