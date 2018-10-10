package com.siyu.designmode.factory;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.factory
 * @Class: Drive
 * @Description: 工厂类角色
 * @date 2018/8/29 15:50
 */
public class Drive {

    //工厂方法
    public static Car driveCar(String param){
        switch(param){
            case "Benz" :
                return new Benz();
            case "Bmw" :
                return new Bwm();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }
}
