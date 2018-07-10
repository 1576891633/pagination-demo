package com.lensyn.limit.entity;

/**
 * Created by lizhongfu on 18:46 2018/7/9
 * 消息查询实体类
 */
public class NoticeCondition {

    private String title;
    private String senderName;
    //消息接收者必传
    private String receiver;
    //当前页码
    private Integer page = 1;
    //每页数据条数
    private Integer rows = 20;
    //分页开始位置
    private Integer startPosition;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getStartPosition() {
        return (page-1)*rows;
    }

    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }
}
