package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Chen
 * @create 2021-02-27 0:27
 */
@Data
public class Comment {

    private int id;
    private int userId;
    private int entityType;
    private int entityId;
    private int targetId;
    private String content;
    private int status;
    private Date createTime;

}
