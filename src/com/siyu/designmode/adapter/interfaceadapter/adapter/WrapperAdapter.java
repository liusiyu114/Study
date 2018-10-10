package com.siyu.designmode.adapter.interfaceadapter.adapter;

import com.siyu.designmode.adapter.interfaceadapter.IPort;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.adapter.interfaceadapter.adapter
 * @Class: A
 * @Description: TODO
 * @date 2018/8/30 18:25
 */
public abstract class WrapperAdapter implements IPort {
    @Override
    public void SSH(){};

    @Override
    public void NET(){};

    @Override
    public void Tomcat(){};

    @Override
    public void Mysql(){};

    @Override
    public void Oracle(){};

    @Override
    public void FTP(){};
}
