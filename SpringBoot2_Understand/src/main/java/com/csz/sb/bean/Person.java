package com.csz.sb.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @BelongsPackage: com.csz.sb.bean
 * @ClassName: Person
 * @Author: 陈苏洲
 * @Description: 人
 * @CreateTime: 2023-10-12 11:47
 * @Version: 1.0
 */

// 将人类放进容器中 只有在容器中的组件才能使用SpringBoot的强大功能
@Component
// 配置绑定
@ConfigurationProperties(prefix = "person")
@Data
@ToString
public class Person {
	private String userName;
	private Boolean boss;
	private Date birth;
	private Integer age;
	private Pet pet;
	private String[] interests;
	private List<String> animal;
	private Map<String, Object> score;
	private Set<Double> salarys;
	private Map<String, List<Pet>> allPets;
}
