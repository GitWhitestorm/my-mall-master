package com.whitestorm.mymall.controller;

import com.whitestorm.mymall.common.api.CommonResult;
import com.whitestorm.mymall.common.redisService.RedisServiceImpl;
import com.whitestorm.mymall.dto.AdminLoginDto;
import com.whitestorm.mymall.service.AdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(tags = "AdminController", description = "后台管理")

@RequestMapping("/admin")
public class AdminController {

    @Autowired
    RedisServiceImpl redisService;

    @Autowired
    AdminService adminService;


    public CommonResult login(@RequestBody AdminLoginDto adminLoginDto){

    }
}
