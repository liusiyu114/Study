package com.siyu.multithreading.runnable;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.multithreading.runnable
 * @Class: Runnable
 * @Description: TODO
 * @date 2018/8/23 19:50
 * @ps Thread2类通过实现Runnable接口，使得该类有了多线程类的特征。run（）方法是多线程程序的一个约定。所有的多线程代码都在run方法里面。Thread类实际上也是实现了Runnable接口的类。
 */
public class Runnable implements java.lang.Runnable{

    private String name;

    public Runnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
