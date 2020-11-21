package com.wenyu7980.data.jpa.auditing.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 *
 * @author wenyu
 */

@MappedSuperclass
@EntityListeners({ AuditingEntityListener.class })
public abstract class AbstractEntity {

    /** 创建者id */
    @CreatedBy
    private String createdUserId;
    /** 创建时间 */
    @CreatedDate
    private LocalDateTime createdDateTime;
    /** 更新者id */
    @LastModifiedBy
    private String updatedUserId;
    /** 更新时间 */
    @LastModifiedDate
    private LocalDateTime updatedDateTime;
    /** 删除标志 */
    private Boolean deletedFlag = false;

    /**
     * 设置删除
     * @param deletedFlag
     */
    public void setDeletedFlag(boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public String getUpdatedUserId() {
        return updatedUserId;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public Boolean getDeletedFlag() {
        return deletedFlag;
    }
}
