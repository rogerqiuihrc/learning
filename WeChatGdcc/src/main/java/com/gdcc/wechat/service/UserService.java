package com.gdcc.wechat.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdcc.wechat.model.User;
import com.gdcc.wechat.repository.UserDao;

@Service
public class UserService {

    @Autowired
    UserDao UserDao;

    // SpringBoot JPA 默认CRUD实现
    public void save(User po) {
        UserDao.save(po);        
    }

    public List<User> list() {
        return UserDao.findAll();
    }

    public void delete(Long id) {
        UserDao.delete(id);
    }
    
    public User find(Long id) {
        return UserDao.findOne(id);
    }

   

}
