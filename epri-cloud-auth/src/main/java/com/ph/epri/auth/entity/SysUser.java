package com.ph.epri.auth.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2019-06-12 16:37:04
 */
@Data
@ApiModel(value = "SysUser实体类",description = "SysUser")
public class SysUser implements Serializable {
    private static final long serialVersionUID = -38634139180253238L;

    @ApiModelProperty(value = "主键标识")
    private Long id;


    @ApiModelProperty(value = "用户名")
    private String username;


    @ApiModelProperty(value = "密码")
    private String password;


    @ApiModelProperty(value = "盐")
    private String salt;


    @ApiModelProperty(value = "电子邮箱")
    private String email;


    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;


    @ApiModelProperty(value = "创建日期")
    private Date createDate;


    @ApiModelProperty(value = "修改日期")
    private Date updateDate;


    @ApiModelProperty(value = "是否锁定0未锁定 1锁定")
    private Integer locked;


}