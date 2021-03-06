package com.ird.faa.security.service.facade;

import java.util.List;

import com.ird.faa.bean.Client;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;

import com.ird.faa.security.bean.User;

public interface UserService extends UserDetailsService {

    void preparePassAndRole(User user);

    List<User> findAll();

    User findByUsername(String username);

    User findById(Long id);

    void deleteById(Long id);

    User prepare(User user);

    User save(User user);

    User update(User user);

    int delete(Long id);

    User findByUsernameWithRoles(String username);

    int deleteByUsername(String username);

    public UserDetails loadUserByUsername(String username);

    void prepareSave(User user);
}
