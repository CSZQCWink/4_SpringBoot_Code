package com.csz.sb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsPackage: com.csz.sb.entity
 * @ClassName: User
 * @Author: 陈苏洲
 * @Description: 用户类
 * @CreateTime: 2023-09-20 16:53
 * @Version: 1.0
 */
@Data // @Data: 结合了 @ToString、@EqualsAndHashCode、@Getter 和 @Setter 的功能，一次性生成所有常用方法
@NoArgsConstructor // 自动生成无参的构造方法
@AllArgsConstructor // 自动生成有所有的构造方法
public class User {
	private String name;
	private String age;
	private Pet pet;

}
