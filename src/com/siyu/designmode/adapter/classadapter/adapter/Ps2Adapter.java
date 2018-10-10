package com.siyu.designmode.adapter.classadapter.adapter;

import com.siyu.designmode.adapter.classadapter.IPs2;
import com.siyu.designmode.adapter.classadapter.impl.UsbImpl;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.adapter.classadapter.adapter
 * @Class: Ps2Adapter
 * @Description: TODO
 * @date 2018/8/30 18:04
 */
public class Ps2Adapter extends UsbImpl implements IPs2 {
    @Override
    public void isPs2() {
        this.isUsb();
    }
}
