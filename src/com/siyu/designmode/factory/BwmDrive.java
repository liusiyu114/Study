package com.siyu.designmode.factory;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.factory
 * @Class: BwmDrive
 * @Description: TODO
 * @date 2018/8/29 16:12
 */
public class BwmDrive implements Drive1{
    @Override
    public Car driveCar() {
        return new Bwm();
    }
}
