package com.ph.epri.rabc.service.impl;

import com.ph.epri.rabc.model.entity.SysRole;
import com.ph.epri.rabc.dao.SysRoleDao;
import com.ph.epri.rabc.service.SysRoleService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 系统角色表(SysRole)表服务实现类
 *
 * @author penghui
 * @since 2019-06-17 10:44:36
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao,SysRole> implements SysRoleService {
   
    @Autowired
    private SysRoleDao sysRoleDao;

   
}