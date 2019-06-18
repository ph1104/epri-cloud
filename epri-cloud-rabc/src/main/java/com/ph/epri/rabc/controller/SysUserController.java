package com.ph.epri.rabc.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ph.epri.rabc.model.entity.SysUser;
import com.ph.epri.rabc.service.SysUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * (SysUser)表控制层
 *
 * @author penghui
 * @since 2019-06-14 09:02:39
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户controlller")
public class SysUserController {
    /**
     * 服务对象
     */
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/getUserByName")
    public SysUser getUserByName(@RequestParam String username){
        SysUser sysUser = sysUserService.getOne(new QueryWrapper<SysUser>().eq("username",username));
        return sysUser;
    }



}