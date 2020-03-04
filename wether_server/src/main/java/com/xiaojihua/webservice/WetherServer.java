package com.xiaojihua.webservice;

import javax.jws.WebService;

@WebService
public interface WetherServer {
    public String getCityInfoByName(String name);
}
