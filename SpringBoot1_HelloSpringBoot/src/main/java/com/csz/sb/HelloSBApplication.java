package com.csz.sb;

import com.csz.sb.entity.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @BelongsPackage: com.csz.sb
 * @ClassName: HelloSBApplication
 * @Author: 陈苏洲
 * @Description: 主程序
 * @CreateTime: 2023-09-20 12:02
 * @Version: 1.0
 */

@SpringBootApplication
// 开启Car类的配置绑定功能
@EnableConfigurationProperties(Car.class)
public class HelloSBApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(HelloSBApplication.class, args);
		System.out.println(run.containsBean("user02"));
	}
}
