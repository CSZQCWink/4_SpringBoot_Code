package com.csz.sb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsPackage: com.csz.sb.entity
 * @ClassName: Pet
 * @Author: 陈苏洲
 * @Description: 宠物类
 * @CreateTime: 2023-09-20 16:53
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
	private String name;
	private String age;
}
