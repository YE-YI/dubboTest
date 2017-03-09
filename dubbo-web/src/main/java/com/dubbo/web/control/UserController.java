package com.dubbo.web.control;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yy.api.dubbo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yeyi
 * @version 1.0
 * @time 13:49
 * @since 2016/8/16
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(UserController.class);
	
	@Reference(version = "0.0.1")
	private UserService userService;
	
	@RequestMapping("/hello")
	public String index(Model model){
		String name=userService.hello(" springMVC & dubbo & Zookeeper");
		logger.info("xx=="+name);
		return "";
	}
}
