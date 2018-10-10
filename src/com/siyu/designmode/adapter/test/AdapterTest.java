package com.siyu.designmode.adapter.test;

import com.siyu.designmode.adapter.classadapter.IPs2;
import com.siyu.designmode.adapter.classadapter.adapter.Ps2Adapter;
import com.siyu.designmode.adapter.classadapter.impl.UsbImpl;
import com.siyu.designmode.adapter.interfaceadapter.IPort;
import com.siyu.designmode.adapter.interfaceadapter.adapter.Chat;
import com.siyu.designmode.adapter.interfaceadapter.adapter.Server;
import org.junit.Test;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.adapter.test
 * @Class: AdapterTest
 * @Description: TODO
 * @date 2018/8/30 18:06
 */
public class AdapterTest {

    //类适配器
    @Test
    public void test(){
        IPs2 ps2 = new Ps2Adapter();
        ps2.isPs2();
    }

    //对象适配器
    @Test
    public void test1(){
        IPs2 ps2 = new com.siyu.designmode.adapter.objectadapter.adapter.Ps2Adapter(new UsbImpl());
        ps2.isPs2();
    }
    //接口适配器
    @Test
    public void test2(){
        IPort chatPort = new Chat();
        IPort serverPort = new Server();

        // 聊天服务
        chatPort.FTP();
        chatPort.NET();

        // 服务器
        serverPort.Mysql();
        serverPort.SSH();
        serverPort.Tomcat();
        serverPort.NET();

    }
}
