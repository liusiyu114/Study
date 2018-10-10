package com.siyu.test;

import com.siyu.test.adapter.IRequet;
import com.siyu.test.adapter.impl.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.test
 * @Class: Test
 * @Description: TODO
 * @date 2018/8/30 9:48
 */
public class Test {

    @org.junit.Test
    public void test(){
        new Thread(new Runner(),"B").start();
        new Thread(new Runner(),"C").start();
    }

    @org.junit.Test
    public void test1(){
        Map<String, Object> map = new HashMap<>();

        IRequet requet = new RestController();
        requet.requestControl(map);
    }
}
