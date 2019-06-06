package com.sharding.sphere.controller;

import com.sharding.sphere.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/6 11:58
 * @description:
 */
@RestController
public class TestController {

    @Autowired
    private CommonService commonService;

    @GetMapping(value = "/save")
    public String save() {
        commonService.save();
        return "插入成功";
    }
}
