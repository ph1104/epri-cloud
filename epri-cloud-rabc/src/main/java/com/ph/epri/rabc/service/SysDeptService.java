package com.ph.epri.rabc.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ph.epri.rabc.model.dto.DeptTree;
import com.ph.epri.rabc.model.entity.SysDept;

import java.util.List;


/**
 * 部门管理(SysDept)表服务接口
 *
 * @author penghui
 * @since 2019-06-17 10:43:29
 */
public interface SysDeptService extends IService<SysDept>{


    Boolean saveDept(SysDept sysDept);

    List<DeptTree> deptTree();

    Boolean updateDept(SysDept sysDept);

}