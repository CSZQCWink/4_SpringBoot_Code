package com.csz.sb.controller;

import com.csz.sb.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsPackage: com.csz.sb.controller
 * @ClassName: PersonController
 * @Author: 陈苏洲
 * @Description: 控制类
 * @CreateTime: 2023-10-12 13:15
 * @Version: 1.0
 */

@RestController
public class PersonController {

	@Autowired
	Person  person;

	@GetMapping("/person")
	public Person person(){
		return person;
	}
}
