package com.ph.epri.rabc.controller;

import com.ph.epri.rabc.model.entity.SysMenu;
import com.ph.epri.rabc.service.SysMenuService;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 菜单权限表(SysMenu)表控制层
 *
 * @author penghui
 * @since 2019-06-17 10:44:30
 */
@RestController
@RequestMapping("sysMenu")
@Api(tags = "SysMenuController  controller")
public class SysMenuController {
    /**
     * 服务对象
     */
    @Autowired
    private SysMenuService sysMenuService;

}