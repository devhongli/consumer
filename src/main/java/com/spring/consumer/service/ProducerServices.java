package com.spring.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "producer-service")
public interface  ProducerServices {
    @RequestMapping(value = "/producers-service/queryCustInfo" ,method = RequestMethod.GET)
    String queryCustInfo(@RequestParam(value = "custno") String custno);
}