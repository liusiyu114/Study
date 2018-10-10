package com.siyu.multithreading.thread;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.multithreading.thread
 * @Class: Thread
 * @Description: TODO
 * @date 2018/8/23 19:36
 * @ps start()方法的调用后并不是立即执行多线程代码，而是使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
 */
public class Thread extends java.lang.Thread{
    private String name;

    public Thread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
