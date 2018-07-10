package com.lensyn.limit.controller;

import com.lensyn.limit.entity.Notice;
import com.lensyn.limit.entity.NoticeCondition;
import com.lensyn.limit.service.PaginationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lizhongfu on 18:39 2018/7/9
 * 分页demo控制器
 */
@SpringBootApplication
@RestController
public class PaginationController {

    @Autowired
    private PaginationService paginationService;

    @RequestMapping("/pagination")
    public Object getNotice(NoticeCondition notice){
        if (notice.getReceiver() == null) {
            return "消息接收者不能为空!";
        }
        return paginationService.getNotice(notice);
    }
}
