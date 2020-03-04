package com.xiaojihua.webservice;


import com.xiaojihua.webservice.impl.WetherServerImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class WetherServerTest {
    public static void main(String[] args){
        JaxWsServerFactoryBean serverFactory = new JaxWsServerFactoryBean();
        //这个地址是自己写的
        serverFactory.setAddress("http://localhost:12345/weather1212");
        serverFactory.setServiceBean(new WetherServerImpl());
        serverFactory.create();
    }
}
