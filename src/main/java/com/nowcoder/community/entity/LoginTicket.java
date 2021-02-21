package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Chen
 * @create 2021-02-19 20:53
 */
@Data
public class LoginTicket {

    private int id;
    private int userId;
    private String ticket;
    private int status;
    private Date expired;

}
