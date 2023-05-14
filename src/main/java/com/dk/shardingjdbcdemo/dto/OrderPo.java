package com.dk.shardingjdbcdemo.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("t_order")
@Builder
public class OrderPo {
    // @TableId(type = IdType.ASSIGN_ID)//分布式id
    @TableId(type = IdType.AUTO)
    private Long id;
    private String orderNo;
    private Long userId;
    private BigDecimal amount;
}
