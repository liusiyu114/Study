package com.siyu.designmode.adapter.interfaceadapter.adapter;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.adapter.interfaceadapter.adapter
 * @Class: Chat
 * @Description: 提供聊天服务, 需要网络和文件传输功能
 * @date 2018/8/30 18:32
 */
public class Chat extends WrapperAdapter{

    @Override
    public void NET(){ System.out.println("Hello world!"); };

    @Override
    public void FTP(){ System.out.println("File upload succeddful!"); };

}
