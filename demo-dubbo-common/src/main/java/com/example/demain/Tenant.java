package com.example.demain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "tenant")
@Data
public class Tenant implements Serializable {
    @Id
    @Column(name="tenantID",length=30)
    @NotEmpty(message = "租户名不能为空")
    private String tenantID;

    @Column(name="tenantPwd",length=100)
    @NotEmpty(message = "租户密码不能为空")
    private String tenantPwd;

    @Column(name="connectionUrl",length=1000)
    @NotEmpty(message = "数据库连接不能为空")
    private String connectionUrl;

    @Column(name="type",length=200)
    private String type;

    @Column(name="dbusername",length=30)
    private String dbusername;

    @Column(name="dbPwd",length=100)
    private String dbPwd;

}
