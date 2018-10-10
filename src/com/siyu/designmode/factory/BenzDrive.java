package com.siyu.designmode.factory;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.factory
 * @Class: BenzDrive
 * @Description: 具体工厂角色
 * @date 2018/8/29 16:10
 */
public class BenzDrive implements Drive1{
    @Override
    public Car driveCar() {
        return new Benz();
    }
}
