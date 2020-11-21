package com.wenyu7980.data.jpa.query;

/**
 *
 * @author wenyu
 */
public interface ConvertList<E, T> {
    /**
     * 转换
     * @param entity
     * @return
     */
    T convertList(E entity);
}
