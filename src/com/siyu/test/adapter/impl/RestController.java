package com.siyu.test.adapter.impl;

import java.util.Map;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.test.adapter.impl
 * @Class: RestController
 * @Description: TODO
 * @date 2018/8/30 22:40
 */
public class RestController extends WrapperAdapter{

    public void requestControl(Map<String, Object> map){
        System.out.println("请求rest服务");
    }

    public void rest(){
        System.out.println("111");
    }
}
