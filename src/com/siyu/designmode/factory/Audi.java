package com.siyu.designmode.factory;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.factory
 * @Class: Audi
 * @Description: 具体产品角色
 * @date 2018/8/29 15:44
 */
public class Audi implements Car{
    @Override
    public String drive() {
        return "Driving Audi";
    }
}
