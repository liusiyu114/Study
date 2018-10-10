package com.siyu.designmode.adapter.interfaceadapter.adapter;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.adapter.interfaceadapter.adapter
 * @Class: Server
 * @Description: 网站服务器, 需要Tomcat容器，Mysql数据库，网络服务，远程服务
 * @date 2018/8/30 18:34
 */
public class Server extends WrapperAdapter{

    @Override
    public void SSH(){ System.out.println("Connect success!"); };

    @Override
    public void NET(){ System.out.println("Hello WWW!"); };

    @Override
    public void Tomcat(){ System.out.println("Tomcat 9 is running!"); };

    @Override
    public void Mysql(){ System.out.println("Mysql is running!"); };
}
