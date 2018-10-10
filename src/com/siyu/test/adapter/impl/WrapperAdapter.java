package com.siyu.test.adapter.impl;

import com.siyu.test.adapter.IRequet;

import java.util.Map;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.test.adapter.impl
 * @Class: WrapperAdapter
 * @Description: TODO
 * @date 2018/8/30 22:32
 */
public abstract class WrapperAdapter implements IRequet{

    @Override
    public void requestControl(Map<String, Object> map){};
}
