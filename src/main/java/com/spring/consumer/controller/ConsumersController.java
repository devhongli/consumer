package com.spring.consumer.controller;

import com.spring.consumer.feignClientService.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/a")
@RestController
public class ConsumersController {

    @Value("${server.port}")
    String port;

//    @Autowired
//    HelloService helloService;

    @Autowired
    FeignClientService feignClientService;

    @RequestMapping("/home")
    public String home(@RequestParam String name) {
        return  name + "i am from port:" + port;
    }

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String custNo) {
        return feignClientService.queryCustInfo(custNo);
        //return helloService.hiService(name);
    }

}
