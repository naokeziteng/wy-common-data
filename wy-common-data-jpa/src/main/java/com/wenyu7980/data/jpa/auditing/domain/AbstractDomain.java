package com.wenyu7980.data.jpa.auditing.domain;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 *
 * @author wenyu
 */
public abstract class AbstractDomain {
    @ApiModelProperty(value = "创建者", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private String createdUserId;
    @ApiModelProperty(value = "创建时间", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private LocalDateTime createdDateTime;
    @ApiModelProperty(value = "更新者", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private String updatedUserId;
    @ApiModelProperty(value = "更新者", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private LocalDateTime updatedDateTime;
    @ApiModelProperty(value = "删除标志", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private Boolean deletedFlag;

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }
}
