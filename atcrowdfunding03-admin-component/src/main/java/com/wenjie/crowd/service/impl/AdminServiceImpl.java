package com.wenjie.crowd.service.impl;

import com.wenjie.crowd.entity.Admin;
import com.wenjie.crowd.entity.AdminExample;
import com.wenjie.crowd.mapper.AdminMapper;
import com.wenjie.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wenjie FU
 * @create 2021-11-17 23:12
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public void saveAdmin(Admin admin) {

        adminMapper.insert(admin);

    }

    public List<Admin> getAll() {
        return adminMapper.selectByExample(new AdminExample());
    }
}
