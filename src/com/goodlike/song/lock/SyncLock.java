package com.goodlike.song.lock;

/**
 * @author Song Yinghui
 * @date 2019/12/5
 * @Version 1.0
 * synchronized 使用方式
 *  synchronized 每个对象都有一个自己的锁，代码块能不能锁住 只看能不能获取所锁对象的锁，
 *  也就是说 如果synchronized内容是同一个对象（所有线程都对同一个对象），那么多个线程在执行此处时便要依次序来获取该对象的锁进而进行处理，
 *  如果synchronized内容不是同一个对象（一个线程对应一个对象），那么多个线程在执行到此处时，每个线程都可获取到锁，因为取锁的地方不是唯一的，此时的同步并不能生效。
 */
public class SyncLock {

    int count = 0 ;
    public synchronized void test(){

        try {
            Thread.sleep(2 * 1000L);
            System.out.println("---");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 可在此处验证synchronized 为可重入锁，
     * 假设synchronized 不是可重入锁，则方法里面再次调用这个方法时会重新竞争锁，而次方法并未执行完，该线程第一次拿到的锁并未释放，当内部调用第二次去拿锁时便会造成阻塞，进而导致第一次拿到的锁不会释放，进而会一直等待。
     * 但是此处运行结果并不是死等，可证明synchronized 为可重入锁。
     */
    public synchronized void objectTest(){
        synchronized (SyncLock.class){
            if (count < 10) {
                try {
                    System.out.println("begin--");
                    Thread.sleep(2 * 1000L);
                    System.out.println("---");
                    count++;
                    objectTest();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SyncLock syncLock = new SyncLock();
        new Thread(()->{
            System.out.println("Thread1---");
            //syncLock.test();
            new SyncLock().objectTest();
            new SyncLock().objectTest();
        }).start();
        new Thread(()->{
            System.out.println("Thread2---");
            //syncLock.test();
            new SyncLock().test();
        }).start();
    }
}
