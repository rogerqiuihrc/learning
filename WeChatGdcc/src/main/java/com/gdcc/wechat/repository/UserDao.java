package com.gdcc.wechat.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gdcc.wechat.model.User;


public interface UserDao extends  JpaRepository<User, Serializable> { 
	

}
