package com.siyu.designmode.adapter.classadapter.impl;

import com.siyu.designmode.adapter.classadapter.IUsb;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.adapter.classadapter.impl
 * @Class: UsbImpl
 * @Description: TODO
 * @date 2018/8/30 18:03
 */
public class UsbImpl implements IUsb{
    @Override
    public void isUsb() {
        System.out.println("Usb接口");
    }
}
