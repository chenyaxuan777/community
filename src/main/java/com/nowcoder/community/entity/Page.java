package com.nowcoder.community.entity;

import lombok.Data;

/**
 * @author Chen
 * @create 2021-02-05 22:25
 */
@Data
public class Page {
    //当前页码
    private int current = 1;
    //显示上限
    private int limit = 10;
    //数据总数
    private int rows;
    //查询路径（用于复用分页链接）
    private String path;
    /**
     * 获取当前页的起始行
     * @return
     */
    public int getOffset() {
        return (current - 1) * limit;
    }
    /**
     * 获取总页数
     * @return
     */
    public int getTotal() {
        if (rows % limit == 0)
            return rows / limit;
        else
            return rows / limit + 1;
    }
    /**
     * 获取起始页码
     * @return
     */
    public int getFrom() {
        int from = current - 2;
        return from < 1 ? 1 : from;
    }

    /**
     * 获取结束页码
     * @return
     */
    public int getTo() {
        int to = current + 2;
        int total = getTotal();
        return to > total ? total : to;
    }
}
