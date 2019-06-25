package com.spring.consumer.controller;

import com.spring.consumer.service.ProducerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumersController {

    @Value("${server.port}")
    String port;

//    @Autowired
//    HelloService helloService;

    @Autowired
    ProducerServices producerServices;

//    @Autowired
//    RestTemplate restTemplate;

    @RequestMapping("/home")
    public String home(@RequestParam String name) {
        return  name + "i am from port:" + port;
    }

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String custno) {
        return producerServices.queryCustInfo(custno);
        //return helloService.hiService(name);
    }


//    public String hiService(String name) {
//        return restTemplate.getForObject("http://producer-service/queryCustInfo?custNo="+custNo,String.class);
//    }
}
