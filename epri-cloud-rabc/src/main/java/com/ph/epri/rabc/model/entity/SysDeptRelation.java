package com.ph.epri.rabc.model.entity;

import java.io.Serializable;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 部门关系表(SysDeptRelation)实体类
 *
 * @author penghui
 * @since 2019-06-17 10:44:20
 */
@Data
@ApiModel(value = "SysDeptRelation实体类",description = "SysDeptRelation")
public class SysDeptRelation implements Serializable {
    private static final long serialVersionUID = -98039450362935949L;

    @ApiModelProperty(value = "祖先节点")
    private Integer ancestor;


    @ApiModelProperty(value = "后代节点")
    private Integer descendant;


}