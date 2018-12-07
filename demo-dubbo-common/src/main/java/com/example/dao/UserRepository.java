package com.example.dao;

import com.example.demain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/12/5 0005.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
