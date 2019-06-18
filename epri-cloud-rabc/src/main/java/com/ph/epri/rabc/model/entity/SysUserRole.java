package com.ph.epri.rabc.model.entity;

import java.io.Serializable;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 用户角色表(SysUserRole)实体类
 *
 * @author penghui
 * @since 2019-06-17 10:44:58
 */
@Data
@ApiModel(value = "SysUserRole实体类",description = "SysUserRole")
public class SysUserRole implements Serializable {
    private static final long serialVersionUID = 563996760259615326L;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;


    @ApiModelProperty(value = "角色ID")
    private Integer roleId;


}