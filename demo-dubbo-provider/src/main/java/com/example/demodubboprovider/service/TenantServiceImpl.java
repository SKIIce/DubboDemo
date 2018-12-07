package com.example.demodubboprovider.service;

import com.example.dao.TenantRepository;
import com.example.demain.Tenant;
import com.example.dubbo.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service(interfaceClass = TenantService.class)
public class TenantServiceImpl implements TenantService {
    @Autowired
    TenantRepository tenantDao;

    @Override
    public Tenant findByTenantID(String tenantID) {
        List<Tenant> tenantList = tenantDao.findByTenantID(tenantID);
        if(tenantList.size() == 1){
            return tenantList.get(0);
        }
        return null;
    }

    @Override
    public boolean verifyLogin(Tenant tenantUser) {
        List<Tenant> tenantList = tenantDao.findByTenantIDAndTenantPwd(tenantUser.getTenantID(),tenantUser.getTenantPwd());
        return tenantList.size() > 0;
    }
}
