package com.wenjie.crowd.service.api;
import com.wenjie.crowd.entity.Admin;
import com.wenjie.crowd.mapper.AdminMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wenjie FU
 * @create 2021-11-17 22:17
 */
@Service
public interface AdminService {
    public void saveAdmin(Admin admin);

    List<Admin> getAll();
}
