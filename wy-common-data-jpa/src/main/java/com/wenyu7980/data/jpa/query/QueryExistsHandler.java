package com.wenyu7980.data.jpa.query;

import com.wenyu7980.query.QueryPredicateExpress;

/**
 *
 * @author wenyu
 */
public interface QueryExistsHandler {
    /**
     * 是否存在
     * @param express
     * @return
     */
    default boolean exists(QueryPredicateExpress express) {
        return count(express) > 0;
    }

    /**
     * 数量
     * @param express
     * @return
     */
    long count(QueryPredicateExpress express);
}
