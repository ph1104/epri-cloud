package com.ph.epri.rabc.service.impl;

import com.ph.epri.rabc.model.entity.SysRoleMenu;
import com.ph.epri.rabc.dao.SysRoleMenuDao;
import com.ph.epri.rabc.service.SysRoleMenuService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 角色菜单表(SysRoleMenu)表服务实现类
 *
 * @author penghui
 * @since 2019-06-17 10:44:49
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao,SysRoleMenu> implements SysRoleMenuService {
   
    @Autowired
    private SysRoleMenuDao sysRoleMenuDao;


    @Override
    public Boolean removeRoleMenu(Integer menuId) {
        return sysRoleMenuDao.removeRoleMenu(menuId);
    }
}