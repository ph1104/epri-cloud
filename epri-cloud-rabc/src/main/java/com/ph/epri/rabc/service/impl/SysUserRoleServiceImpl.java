package com.ph.epri.rabc.service.impl;

import com.ph.epri.rabc.model.entity.SysUserRole;
import com.ph.epri.rabc.dao.SysUserRoleDao;
import com.ph.epri.rabc.service.SysUserRoleService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户角色表(SysUserRole)表服务实现类
 *
 * @author penghui
 * @since 2019-06-17 10:44:58
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao,SysUserRole> implements SysUserRoleService {
   
    @Autowired
    private SysUserRoleDao sysUserRoleDao;

   
}