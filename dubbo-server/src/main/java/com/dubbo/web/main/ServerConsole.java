package com.dubbo.web.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yeyi
 * @version 1.0
 * @time 10:49
 * @since 2016/8/16
 */
public class ServerConsole {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-registry.xml" });
		context.start();
		
		System.in.read(); // 按任意键退出
	}
}
