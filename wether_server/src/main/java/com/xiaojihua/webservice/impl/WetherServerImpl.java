package com.xiaojihua.webservice.impl;

import com.xiaojihua.webservice.WetherServer;

public class WetherServerImpl implements WetherServer {
    public String getCityInfoByName(String name) {
        if(name.equals("北京")){
            return name + ":雾霾";
        }else{
            return name + ":晴";
        }
    }
}
