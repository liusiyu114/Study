package com.siyu.multithreading.runnable.test;

import com.siyu.multithreading.runnable.Runnable;
import org.junit.Test;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.multithreading.runnable.test
 * @Class: RunnableTest
 * @Description: TODO
 * @date 2018/8/23 19:51
 */
public class RunnableTest {

    @Test
    public void test(){
       new Thread(new Runnable("A")).start();
       new Thread(new Runnable("B")).start();
    }
}
