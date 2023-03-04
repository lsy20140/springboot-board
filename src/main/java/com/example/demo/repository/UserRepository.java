package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getAllUsers() {
        List<String> userList = new ArrayList<>();
        userList.addAll(jdbcTemplate.queryForList("select userId from user;", String.class));
        return userList;
    }
}
