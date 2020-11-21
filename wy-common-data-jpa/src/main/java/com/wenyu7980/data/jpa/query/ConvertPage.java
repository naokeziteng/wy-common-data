package com.wenyu7980.data.jpa.query;

/**
 *
 * @author wenyu
 */
public interface ConvertPage<E, P> {
    /**
     * 转换
     * @param entity
     * @return
     */
    P convertPage(E entity);
}
