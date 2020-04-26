package com.spring.vardhan.studentservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.vardhan.studentservice.config.ClientConfiguration;
import com.spring.vardhan.studentservice.model.Marks;

@FeignClient(value = "results", url = "http://localhost:8085", configuration = ClientConfiguration.class)
public interface StudentResultsClient {
    
    @RequestMapping(method = RequestMethod.GET, value = "/results/{id}")
    Marks getMarks(@PathVariable("id") int id);

}