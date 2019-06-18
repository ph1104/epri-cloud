package com.ph.epri.rabc.model.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 系统角色表(SysRole)实体类
 *
 * @author penghui
 * @since 2019-06-17 10:44:36
 */
@Data
@ApiModel(value = "SysRole实体类",description = "SysRole")
public class SysRole implements Serializable {
    private static final long serialVersionUID = 672911425585920130L;

    
    private Integer roleId;


    
    private String roleName;


    
    private String roleCode;


    
    private String roleDesc;


    
    private Date createTime;


    
    private Date updateTime;


    @ApiModelProperty(value = "删除标识（0-正常,1-删除）")
    private String delFlag;


}