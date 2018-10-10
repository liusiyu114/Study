package com.siyu.multithreading.thread.test;

import com.siyu.multithreading.thread.Thread;
import org.junit.Test;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.multithreading.thread.test
 * @Class: ThreadTest
 * @Description: TODO
 * @date 2018/8/23 19:39
 */
public class ThreadTest {

    @Test
    public void test(){
        Thread t = new Thread("A");
        Thread t1 = new Thread("B");
        t.start();
        t1.start();
    }
}
