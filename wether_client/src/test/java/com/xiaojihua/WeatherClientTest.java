package com.xiaojihua;

import com.xiaojihua.webservice.impl.WetherServer;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class WeatherClientTest {
    public static void main(String[] args){
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setAddress("http://localhost:12345/weather1212?wsdl");
        proxyFactory.setServiceClass(WetherServer.class);
        WetherServer server = (WetherServer) proxyFactory.create();
        String returnStr = server.getCityInfoByName("上海");
        System.out.println(returnStr);
    }
}
