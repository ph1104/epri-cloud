package com.ph.epri.rabc.service;

import com.ph.epri.rabc.model.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * 系统角色表(SysRole)表服务接口
 *
 * @author penghui
 * @since 2019-06-17 10:44:36
 */
public interface SysRoleService extends IService<SysRole>{

    Boolean removeMenu(Integer roleId);


}