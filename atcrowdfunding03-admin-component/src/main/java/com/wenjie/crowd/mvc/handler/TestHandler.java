package com.wenjie.crowd.mvc.handler;

import com.wenjie.crowd.entity.Admin;
import com.wenjie.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Wenjie FU
 * @create 2021-11-20 17:32
 */
@Controller
public class TestHandler {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap){
        List<Admin> adminList = adminService.getAll();

        modelMap.addAttribute("adminList", adminList);

        return "target";
    }
}