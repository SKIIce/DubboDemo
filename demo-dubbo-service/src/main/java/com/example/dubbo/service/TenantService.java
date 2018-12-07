package com.example.dubbo.service;
import com.example.demain.Tenant;

public interface TenantService {

    Tenant findByTenantID(String tenantID);

    boolean verifyLogin(Tenant tenantUser);
}
