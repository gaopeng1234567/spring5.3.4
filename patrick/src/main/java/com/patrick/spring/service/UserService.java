package com.patrick.spring.service;

/**
 * @author patrick
 * @date 2021/3/14 下午4:44
 * @Des 测试
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class UserService {

	private ParentService parentService;

	public UserService() {

	}

	public UserService(ParentService parentService) {
		this.parentService = parentService;
	}

	public ParentService getParentService() {
		return parentService;
	}

	public void setParentService(ParentService parentService) {
		this.parentService = parentService;
	}


}
