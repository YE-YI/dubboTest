package com.dubbo.web.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yy.api.dubbo.service.UserService;

/**
 * @author yeyi
 * @version 1.0
 * @time 10:21
 * @since 2016/8/16
 */
@Service(version = "0.0.1")
public class UserServiceImpl implements UserService {
	public String hello(String name){
		return "hello" + name;
	}
}
