package com.spring.consumer.service;

import com.spring.consumer.service.fallback.SchedualProducerServicesHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "producer-service",fallback = SchedualProducerServicesHystric.class)
public interface  ProducerServices {

    @RequestMapping(value = "/V1/custService/queryCustInfo" ,method = RequestMethod.POST)
    String queryCustInfo(@RequestParam(value = "custno") String custno);

    @RequestMapping(value = "/V1/custService/home" ,method = RequestMethod.POST)
    String home(@RequestParam(value = "name") String name);
}
