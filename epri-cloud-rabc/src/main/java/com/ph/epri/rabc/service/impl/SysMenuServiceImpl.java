package com.ph.epri.rabc.service.impl;

import com.ph.epri.rabc.model.entity.SysMenu;
import com.ph.epri.rabc.dao.SysMenuDao;
import com.ph.epri.rabc.service.SysMenuService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 菜单权限表(SysMenu)表服务实现类
 *
 * @author penghui
 * @since 2019-06-17 10:44:30
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao,SysMenu> implements SysMenuService {
   
    @Autowired
    private SysMenuDao sysMenuDao;

   
}