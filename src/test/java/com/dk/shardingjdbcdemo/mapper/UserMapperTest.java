package com.dk.shardingjdbcdemo.mapper;

import com.dk.shardingjdbcdemo.dto.UserPo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserMapperTest {
    @Resource
    private  UserMapper userMapper;

    @Test
    public void testInsertUser(){
        userMapper.insert(UserPo.builder().uname("李四").build());
        userMapper.insert(UserPo.builder().uname("李四2").build());
        userMapper.insert(UserPo.builder().uname("李四3").build());
        userMapper.insert(UserPo.builder().uname("李四4").build());

        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
        userMapper.selectList(null);
    }
}
