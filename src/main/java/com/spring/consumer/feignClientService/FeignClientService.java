package com.spring.consumer.feignClientService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "PRODUCER-SERVICE")
public interface  FeignClientService {
    @RequestMapping(value = "/producers-service/queryCustInfo/{custNo}" ,method = RequestMethod.GET)
    String queryCustInfo(@RequestParam(value = "custNo") String custNo);
}
