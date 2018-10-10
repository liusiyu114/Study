package com.siyu.test;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.test
 * @Class: Runner
 * @Description: TODO
 * @date 2018/8/30 9:27
 */
public class Runner implements Runnable{
    private int x = 1;

    @Override
    public void run() {
        this.body();
    }


    public void body(){
        synchronized ("lock".intern()){
            for(int i = 0; i<10; i++){
                System.out.println(Thread.currentThread().getName()+":"+x++);
            }
        }
    }
}
