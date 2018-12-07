package com.example.dao;

import com.example.demain.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, String> {
    List<Tenant> findByTenantID(String tenantID);

    List<Tenant> findByTenantIDAndTenantPwd(String tenantID, String pwd);
}
