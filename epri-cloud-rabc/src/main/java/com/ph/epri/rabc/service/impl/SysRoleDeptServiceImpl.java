package com.ph.epri.rabc.service.impl;

import com.ph.epri.rabc.model.entity.SysRoleDept;
import com.ph.epri.rabc.dao.SysRoleDeptDao;
import com.ph.epri.rabc.service.SysRoleDeptService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 角色与部门对应关系(SysRoleDept)表服务实现类
 *
 * @author penghui
 * @since 2019-06-17 10:44:43
 */
@Service("sysRoleDeptService")
public class SysRoleDeptServiceImpl extends ServiceImpl<SysRoleDeptDao,SysRoleDept> implements SysRoleDeptService {
   
    @Autowired
    private SysRoleDeptDao sysRoleDeptDao;

   
}