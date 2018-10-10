package com.siyu.designmode.factory;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.factory
 * @Class: AudiDrive
 * @Description: TODO
 * @date 2018/8/29 16:13
 */
public class AudiDrive implements Drive1{
    @Override
    public Car driveCar() {
        return new Audi();
    }
}
