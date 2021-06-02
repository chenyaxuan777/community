package com.nowcoder.community.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @author Chen
 * @create 2021-02-02 22:37
 */
@Data
@Document(indexName = "discusspost", indexStoreType = "_doc", shards = 6, replicas = 3)
public class DiscussPost {
    @Id
    private int id;
    @Field(type = FieldType.Integer)
    private int userId;

    // 互联网校招
    // analyzer:存储时的分词器，设置最大，尽可能多分词。可能被分为互联网，校招，互联，网校...
    // searchAnalyzer:搜索时的分词器，设置正常，我去搜索时，正常意思是匹配上互联网、校招这两个关键词的都搜出来。
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String title;
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String content;

    @Field(type = FieldType.Integer)
    private int type;
    @Field(type = FieldType.Integer)
    private int status;
    @Field(type = FieldType.Date)
    private Date createTime;
    @Field(type = FieldType.Integer)
    private int commentCount;
    @Field(type = FieldType.Double)
    private double score;

}
