package com.ph.epri.rabc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ph.epri.rabc.model.entity.SysDeptRelation;

/**
 * 部门关系表(SysDeptRelation)表数据库访问层
 *
 * @author penghui
 * @since 2019-06-17 10:44:20
 */
public interface SysDeptRelationDao extends BaseMapper<SysDeptRelation>{
    Boolean removeDeptRelation(Integer id);
}