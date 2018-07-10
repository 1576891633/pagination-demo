package com.lensyn.limit.entity;

/**
 * Created by lizhongfu on 18:43 2018/7/9
 * 消息通知实体类
 */
public class Notice {

    private String messageId;
    private String title;
    private String content;
    private String statusStr;
    private String url;
    private String senderName;
    private String backlogId;
    private String receiver;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getBacklogId() {
        return backlogId;
    }

    public void setBacklogId(String backlogId) {
        this.backlogId = backlogId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
