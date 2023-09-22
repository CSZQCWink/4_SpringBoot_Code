package com.csz.sb.controller;

import com.csz.sb.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsPackage: com.csz.sb.controller
 * @ClassName: HelloSBController
 * @Author: 陈苏洲
 * @Description: HelloSBController控制类
 * @CreateTime: 2023-09-20 13:13
 * @Version: 1.0
 */
@RestController
public class HelloSBController {
    @Autowired
    Car car; // 因为Car已经注册到IOC容器中所以直接使用注解 @Autowired 依赖注入即可

    @GetMapping("/hello")
    public String helloSpringBoot(){
        return "Hello SpringBoot！！";
    }

    @GetMapping("/car")
    public Car car(){
        return car;
    }
}
