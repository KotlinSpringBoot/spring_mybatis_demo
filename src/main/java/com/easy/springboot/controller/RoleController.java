package com.easy.springboot.controller;

import com.easy.springboot.model.Role;
import com.easy.springboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @RequestMapping("/list")
    @ResponseBody
    List<Role> list() {
        return roleService.listAll();
    }

}
