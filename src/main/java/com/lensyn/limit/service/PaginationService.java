package com.lensyn.limit.service;

import com.lensyn.limit.entity.Notice;
import com.lensyn.limit.entity.NoticeCondition;
import com.lensyn.limit.entity.NoticeVo;

import java.util.List;

/**
 * Created by lizhongfu on 18:55 2018/7/9
 */
public interface PaginationService {

    /**
     * 通过条件分页查询消息通知
     * @param notice
     * @return
     */
    NoticeVo getNotice(NoticeCondition notice);
}
