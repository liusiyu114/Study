package com.siyu.designmode.factory.test;

import com.siyu.designmode.factory.AudiDrive;
import com.siyu.designmode.factory.Car;
import com.siyu.designmode.factory.Drive;
import com.siyu.designmode.factory.Drive1;
import org.junit.Test;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.factory.test
 * @Class: Manager
 * @Description: TODO
 * @date 2018/8/29 16:14
 */
public class Magnate {

    //简单工厂模式
    @Test
    public void test(){
        System.out.println(Drive.driveCar("Bmw").drive());
    }

    //工厂方法模式
    @Test
    public void test1(){
        Drive1 drive =  new AudiDrive();

        Car car = drive.driveCar();

        System.out.println(car.drive());

        System.out.println(this.getClass().getName());
    }
}
