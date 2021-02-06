package com.nowcoder.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Chen
 * @create 2021-02-02 22:37
 */
@Data
public class DiscussPost {

    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;

}
