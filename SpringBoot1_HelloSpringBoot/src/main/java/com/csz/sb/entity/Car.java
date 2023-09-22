package com.csz.sb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @BelongsPackage: com.csz.sb.entity
 * @ClassName: Car
 * @Author: 陈苏洲
 * @Description: 车车类
 * @CreateTime: 2023-09-22 15:40
 * @Version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
// 只有在容器中的组件才能使用SpringBoot的强大功能
//@Component
// prefix是前缀为
@ConfigurationProperties(prefix = "mycar")
public class Car {
	private String brand;
	private BigDecimal price;
}
