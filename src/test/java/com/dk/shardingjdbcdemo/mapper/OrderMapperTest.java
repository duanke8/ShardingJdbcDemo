package com.dk.shardingjdbcdemo.mapper;

import com.dk.shardingjdbcdemo.dto.OrderPo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class OrderMapperTest {
    @Resource
    private  OrderMapper orderMapper;

    @Test
    public void testInsertUser(){
        // for (long i = 0; i < 4; i++) {
        //     orderMapper.insert(OrderPo.builder().userId(i).build());
        // }
        // for (int i = 0; i < 4; i++) {
        //     orderMapper.selectList(null);
        // }
        for (long i = 0; i < 4; i++) {
            orderMapper.insert(OrderPo.builder().orderNo("orderNo00"+i).build());
        }
    }
}
