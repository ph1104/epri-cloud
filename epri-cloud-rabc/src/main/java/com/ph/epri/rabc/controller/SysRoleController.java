package com.ph.epri.rabc.controller;

import com.ph.epri.rabc.model.entity.SysRole;
import com.ph.epri.rabc.service.SysRoleService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 系统角色表(SysRole)表控制层
 *
 * @author penghui
 * @since 2019-06-17 10:44:36
 */
@RestController
@RequestMapping("sysRole")
@Api(tags = "SysRoleController  controller")
public class SysRoleController {
    /**
     * 服务对象
     */
    @Autowired
    private SysRoleService sysRoleService;

}