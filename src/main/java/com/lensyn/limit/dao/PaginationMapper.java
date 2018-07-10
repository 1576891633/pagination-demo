package com.lensyn.limit.dao;

import com.lensyn.limit.entity.Notice;
import com.lensyn.limit.entity.NoticeCondition;

import java.util.List;

/**
 * Created by lizhongfu on 18:59 2018/7/9
 */
public interface PaginationMapper {

    /**
     * 通过条件分页查询消息通知
     * @param notice
     * @return
     */
    List<Notice> getNoticeByCondition(NoticeCondition notice);

    /**
     * 通过条件查询消息通知总量
     * @param notice
     * @return
     */
    int getNoticeSum(NoticeCondition notice);
}
