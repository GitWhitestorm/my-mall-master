package com.whitestorm.mymall.service;


import com.whitestorm.mymall.dto.AdminLoginDto;
import com.whitestorm.mymall.mapper.UmsAdminMapper;
import com.whitestorm.mymall.model.UmsAdmin;
import com.whitestorm.mymall.model.UmsAdminExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AdminService {
    String login(AdminLoginDto adminLoginDto);
}
