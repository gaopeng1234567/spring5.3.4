package com.patrick.spring.entry;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author patrick
 * @date 2021/3/7 10:26 上午
 * @Des 测试FactoryBean
 * 最簡單的事是堅持，最難的事還是堅持
 */
@Component
public class UserMapper  implements FactoryBean<User>, BeanClassLoaderAware {
	//定义要返回的对象 返回的是另外一个user
	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<User> getObjectType() {
		return User.class;
	}

	//默认是true就是单列的
	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println(classLoader);
	}
}
