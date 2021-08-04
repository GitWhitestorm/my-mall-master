package com.whitestorm.mymall.service;

import com.whitestorm.mymall.dto.AdminLoginDto;
import com.whitestorm.mymall.mapper.UmsAdminMapper;
import com.whitestorm.mymall.model.UmsAdmin;
import com.whitestorm.mymall.model.UmsAdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sun.security.util.Password;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UmsAdminMapper adminMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String login(AdminLoginDto adminLoginDto) {
        String token = "";
        UmsAdminExample example =  new UmsAdminExample();
        UmsAdminExample.Criteria criteria = example.createCriteria();
        if(adminLoginDto.getUsername()!= null){
            criteria.andUsernameEqualTo(adminLoginDto.getUsername());
        }
        if(adminLoginDto.getPassword()!=null){
            String encodingPassword = passwordEncoder.encode(adminLoginDto.getPassword());
            criteria.andPasswordEqualTo(encodingPassword);
        }
        List<UmsAdmin> admins = adminMapper.selectByExample(example);
        if(admins != null){

        }
        return null;

    }
}
