package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Chen
 * @create 2021-02-27 15:14
 */
@Data
public class Message {

    private int id;
    private int fromId;
    private int toId;
    private String conversationId;
    private String content;
    private int status;
    private Date createTime;

}
