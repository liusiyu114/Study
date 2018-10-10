package com.siyu.designmode.adapter.interfaceadapter;

/**
 * @author siyu
 * @version V1.0
 * @Package com.siyu.designmode.adapter.interfaceadapter
 * @Class: A
 * @Description: TODO
 * @date 2018/8/30 18:23
 */
public interface IPort {
    // 远程SSH端口22
    public void SSH();

    // 网络端口80
    public void NET();

    // Tomcat容器端口8080
    public void Tomcat();

    // Mysql数据库端口3306
    public void Mysql();

    // Oracle数据库端口1521
    public void Oracle();

    // 文件传输FTP端口21
    public void FTP();
}
