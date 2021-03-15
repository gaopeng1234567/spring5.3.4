package com.patrick.spring;

import com.patrick.spring.config.AppConfig;
import com.patrick.spring.entry.User;
import com.patrick.spring.service.ParentService;
import com.patrick.spring.service.UserService;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author patrick
 * @date 2021/3/2 10:08 下午
 * @Des 启动测试
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class SpringBoot {
	public static void main(String[] args) {
//		//获取bean工场
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//		//拿到BeanDefinition对象
//		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition.setBeanClass(User.class);
//		//设置bean为原型
//		beanDefinition.setScope("prototype");
//		//注册到容器中
//		applicationContext.registerBeanDefinition("user", beanDefinition);
//		applicationContext.refresh();
//		System.out.println(applicationContext.getBean("user"));

//		AnnotationConfigApplicationContext applicationContext = new
//				AnnotationConfigApplicationContext(AppConfig.class);
//		System.out.println(applicationContext.getBean("userMapper"));
//		System.out.println(applicationContext.getBean("&userMapper"));
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("spring1.xml");
		System.out.println(context.getBean("userService"));
		UserService userService = (UserService)context.getBean("userService");
		ParentService parentService = userService.getParentService();
		System.out.println(parentService);
	}
}
