package com.kuang.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: kuangxiang
 * @Description:
 * @Date: Create in 17:09 2019/5/20
 * @Modified By:
 */
@Controller
public class IndexController {

	@RequestMapping("/index.htm")
	public String reqIndex(){
		System.out.println("hello world");
		return "index";
	}
}
