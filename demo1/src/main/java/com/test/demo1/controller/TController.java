package com.test.demo1.controller;

import com.test.demo1.mapper.TMapper;
import com.test.demo1.service.TService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Desc:
 * @Author: HC
 * @Since: 2021/3/4
 */
@RequestMapping
@RestController
@Slf4j
public class TController {

//    @Autowired
//    private TMapper te;
//    List<String> queryList(String id) {
//        te.queryList(id);
//        te.query();
//    }


    @Autowired
    private TService tService;
    List<String> queryList(String id) {
        return tService.queryList(id);
    }

}
