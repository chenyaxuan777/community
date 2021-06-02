package com.nowcoder.community.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chen
 * @create 2021-03-08 20:18
 */
public class Event {
    // 比如张三给李四发的帖子点赞
    private String topic;   //点赞事件
    private int userId; //张三id
    private int entityType; //帖子这个类型
    private int entityId;   //帖子id
    private int entityUserId;   //李四id
    private Map<String, Object> data = new HashMap<>(); //其余的可能的事件，没列举上的

    public String getTopic() {
        return topic;
    }

    public Event setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Event setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public Event setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public Event setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityUserId() {
        return entityUserId;
    }

    public Event setEntityUserId(int entityUserId) {
        this.entityUserId = entityUserId;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public Event setData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

}
