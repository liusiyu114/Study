package com.siyu.test;

import com.siyu.test.adapter.IRequet;
import com.siyu.test.adapter.impl.RestController;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

    @org.junit.Test
    public void test2(){
        Arrays.asList( "p", "k", "u","f", "o", "r","k").forEach(e -> System.out.println( e ) );
    }

    @org.junit.Test
    public void test3(){
        Map<String, Object> map = new TreeMap<>();
        new Thread(new Runner(),"B").start();
        this.ceshi1();
    }

    public void ceshi(@NotNull Map<String, Object> param1, @Nullable int a){
        System.out.println("Param1: " + param1.get("a"));
    }

    public void ceshi1(){
        this.ceshi(null, 1);
    }
}
