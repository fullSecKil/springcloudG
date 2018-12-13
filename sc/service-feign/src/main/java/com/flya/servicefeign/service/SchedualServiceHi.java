package com.flya.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi")
public interface SchedualServiceHi {

    @GetMapping(value = "/hi")
    String sayFormClientOne(@RequestParam(value = "name") String name);
}
