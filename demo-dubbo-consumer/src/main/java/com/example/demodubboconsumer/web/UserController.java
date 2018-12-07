package com.example.demodubboconsumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demain.User;
import com.example.dubbo.service.TenantService;
import com.example.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class UserController {
//    @Reference(url = "dubbo://127.0.0.1:20880")
    @Reference
    private UserService userService;

//    @Reference(url = "dubbo://127.0.0.1:20880")
    @Reference
    private TenantService tenantService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUserList(@RequestParam("ds")String tenant, Map<String, Object> model){
        // 动态加载数据源
        //dynamicRegisterDataSourceBean(tenant);

        List<User> users = null;
        if (!"".equals(tenant)){
           // DynamicDataSourceContextHolder.setDataSource(tenant);
            users = userService.findUsersByDatasourcce(tenant);
        } else {
           // DynamicDataSourceContextHolder.restoreDataSource();
            users = userService.findUsersByDefaultDatasourcce();
        }
        model.put("userList", users);
        return "user";
    }
}
