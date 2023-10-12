package com.csz.sb.bean;

/**
 * @BelongsPackage: com.csz.sb.bean
 * @ClassName: Pet
 * @Author: 陈苏洲
 * @Description: 宠物类
 * @CreateTime: 2023-10-12 11:48
 * @Version: 1.0
 */

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Pet {
	private String name;
	private Double weight;
}
