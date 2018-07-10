package com.lensyn.limit.service;

import com.lensyn.limit.dao.PaginationMapper;
import com.lensyn.limit.entity.Notice;
import com.lensyn.limit.entity.NoticeCondition;
import com.lensyn.limit.entity.NoticeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lizhongfu on 18:56 2018/7/9
 */
@Service
public class PaginationServiceImpl implements PaginationService{

    @Autowired
    private PaginationMapper paginationDao;

    @Override
    public NoticeVo getNotice(NoticeCondition notice) {

        NoticeVo noticeVo = new NoticeVo();
        //查询消息总量和数据
        int noticeSum = paginationDao.getNoticeSum(notice);
        List<Notice> notices = paginationDao.getNoticeByCondition(notice);
        //封装
        noticeVo.setNoticeSum(noticeSum);
        noticeVo.setNotices(notices);
        return noticeVo;
    }
}
