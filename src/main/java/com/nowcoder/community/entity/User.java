package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Chen
 * @create 2021-02-01 23:32
 */
@Data
public class User {

    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;

}
