package com.example.dubbo.service;

import com.example.demain.User;

import java.util.List;

/**
 * Created by Administrator on 2016/12/5 0005.
 */
public interface UserService {

	/**
	 * 查询所有的用户信息
	 */
	List<User> findUsersByDefaultDatasourcce();

	List<User> findUsersByDatasourcce(String tenantID);

}
