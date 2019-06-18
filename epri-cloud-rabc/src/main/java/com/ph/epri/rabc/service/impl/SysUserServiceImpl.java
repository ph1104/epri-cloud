package com.ph.epri.rabc.service.impl;

import com.ph.epri.rabc.model.entity.SysUser;
import com.ph.epri.rabc.dao.SysUserDao;
import com.ph.epri.rabc.service.SysUserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户表(SysUser)表服务实现类
 *
 * @author penghui
 * @since 2019-06-17 10:46:27
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao,SysUser> implements SysUserService {
   
    @Autowired
    private SysUserDao sysUserDao;

   
}