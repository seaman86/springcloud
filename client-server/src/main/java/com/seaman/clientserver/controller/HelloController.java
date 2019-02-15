package com.seaman.clientserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-02-15 15:19
 * 功能描述:
 * 修改历史:
 */

@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloController(String name) {
        return restTemplate.getForEntity("http://PRODUCT-SERVER/hello?name="+name, String.class).getBody();
    }
}
