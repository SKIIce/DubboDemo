package com.example.demodubboprovider.service;

import com.example.dao.UserRepository;
import com.example.demain.User;
import com.example.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import  com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/12/5 0005.
 */
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userDao;

	public List<User> findUsersByDefaultDatasourcce() {
		return userDao.findAll();
	}

	public List<User> findUsersByDatasourcce(String tenantID) {
		//DynamicDataSourceContextHolder.setDataSource(tenantID);
		return userDao.findAll();
	}


}
