package com.wenyu7980.data.jpa.auditing.convert;

import com.wenyu7980.data.jpa.auditing.domain.AbstractDomain;
import com.wenyu7980.data.jpa.auditing.entity.AbstractEntity;

/**
 *
 * @author wenyu
 */
public class BaseConvert {
    public static void convert(AbstractEntity entity, AbstractDomain domain) {
        domain.setCreatedDateTime(entity.getCreatedDateTime());
        domain.setCreatedUserId(entity.getCreatedUserId());
        domain.setDeletedFlag(entity.getDeletedFlag());
        domain.setUpdatedDateTime(entity.getUpdatedDateTime());
        domain.setUpdatedUserId(entity.getUpdatedUserId());
    }
}
