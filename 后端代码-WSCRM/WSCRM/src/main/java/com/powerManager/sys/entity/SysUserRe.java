package com.powerManager.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author 编码时长两年半
 * @date 2023-5-15
 */
@TableName("sys_user")
@ApiModel(value = "SysUser对象", description = "系统用户")
public class SysUserRe implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;
    @TableField(exist = false)
    private List<Integer> roleIds;

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("重复密码")
    private String repassword = "";

    @ApiModelProperty("盐")
    private String salt;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("状态  0：禁用   1：正常")
    private Integer status;

    @ApiModelProperty("创建者ID")
    private Long createUserId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getRepassword(){return repassword;}

    public void setRepassword(String repassword){this.repassword = repassword;}
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userId=" + userId +
                ", username=" + username +
                ", password=" + password +
                ", repassword=" + repassword +
                ", salt=" + salt +
                ", email=" + email +
                ", mobile=" + mobile +
                ", status=" + status +
                ", createUserId=" + createUserId +
                ", createTime=" + createTime +
                "}";
    }
}
