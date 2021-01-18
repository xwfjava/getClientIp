package com.example.nginxip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * date 2020/5/14
 */
@RestController
public class TestController {

    @GetMapping("/getIp")
    public String getIp(@RequestHeader("X-Forwarded-For") String ip){
        return ip;
    }
    @GetMapping("/getIp1")
    public String getIp1(HttpServletRequest request){
        return request.getRemoteAddr();
    }
    @GetMapping("/getIp2")
    public String getIp2(@RequestHeader("X-Real-IP") String ip){
        return ip;
    }
}
