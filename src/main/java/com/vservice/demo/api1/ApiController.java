package com.vservice.demo.api1;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 系统心跳
 * Created by yitao on 2019/1/24.
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/registerUser")
    public String registerUser(@RequestBody Map<String, Object> params) {
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        return "ok";
    }

}
