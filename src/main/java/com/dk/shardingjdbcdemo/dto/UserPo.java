package com.dk.shardingjdbcdemo.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@Data
@TableName("t_user")
@Builder
public class UserPo {
    /**
     * id BIGINT AUTO_INCREMENT,
     * uname VARCHAR(30),
     * PRIMARY KEY (id)
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    private String uname;
}
