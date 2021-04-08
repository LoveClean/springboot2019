package com.springboot.framework.dao.pojo;

import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseEntity {
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 状态
     */
    private Byte status;
//    /**
//     * 备注
//     */
//    private String remark;
}