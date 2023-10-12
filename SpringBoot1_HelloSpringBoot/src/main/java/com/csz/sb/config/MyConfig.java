package com.csz.sb.config;

import ch.qos.logback.classic.db.DBHelper;
import com.csz.sb.entity.Pet;
import com.csz.sb.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @BelongsPackage: com.csz.sb.config
 * @ClassName: MyConfig
 * @Author: 陈苏洲
 * @Description:
 * @CreateTime: 2023-09-20 16:59
 * @Version: 1.0
 */


@Configuration(proxyBeanMethods = true) // 告诉SpringBoot这是一个配置类 == 配置文件
@Import({User.class, DBHelper.class})
//@ConditionalOnBean(name = "tom")
@ImportResource("classpath:myconfig.xml")
public class MyConfig {

	@Bean //给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
	public User user01(){
		// 若是proxyBeanMethods = false 则无法进行组件上的依赖
		return new User("Bob", "20",pet01());
	}

	@Bean
	public User tom(){
		return new User();
	}

	@Bean
	public Pet pet01(){
		return new Pet("汪汪","2");
	}
}
