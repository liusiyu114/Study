package com.siyu.designmode.adapter.objectadapter.adapter;

import com.siyu.designmode.adapter.classadapter.IPs2;
import com.siyu.designmode.adapter.classadapter.IUsb;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.adapter.objectadapter.adapter
 * @Class: Ps2Adapter
 * @Description: TODO
 * @date 2018/8/30 18:13
 */
public class Ps2Adapter implements IPs2{

    private IUsb usb;
    public Ps2Adapter(IUsb usb){
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
