package com.lensyn.limit.entity;

import java.util.List;

/**
 * Created by lizhongfu on 19:17 2018/7/9
 * 返回实体对象
 */
public class NoticeVo {

    private Integer noticeSum;
    private List<Notice> notices;

    public Integer getNoticeSum() {
        return noticeSum;
    }

    public void setNoticeSum(Integer noticeSum) {
        this.noticeSum = noticeSum;
    }

    public List<Notice> getNotices() {
        return notices;
    }

    public void setNotices(List<Notice> notices) {
        this.notices = notices;
    }
}
