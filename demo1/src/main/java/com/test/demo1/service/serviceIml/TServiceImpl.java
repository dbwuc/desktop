package com.test.demo1.service.serviceIml;

import com.test.demo1.mapper.TMapper;
import com.test.demo1.service.GtService;
import com.test.demo1.service.TService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc:
 * @Author: HC
 * @Since: 2021/3/4
 */
@Service
public class TServiceImpl implements TService {

    @Autowired
    private TMapper tMapper;

    @Autowired
    private GtService gtService;
    @Override
    public List<String> queryList(String id) {
        gtService.aaa();
        return tMapper.queryList(id);
    }
}
