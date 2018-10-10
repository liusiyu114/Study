package com.siyu.test.kuoshao;

/**
 * Created by siyu on 2018/10/10 21:47
 */
public class Father extends Grandpa{

    public Father(){
        System.out.println("子类无参构造函数");
    }

    public Father(int age){
        System.out.println("Father:"+age);
    }

    public static void main(String[] args){
        //子类实例化时总是先调用父类的无参构造方法 可以指定某个构造方法
        Father father = new Father(123);
    }
}
