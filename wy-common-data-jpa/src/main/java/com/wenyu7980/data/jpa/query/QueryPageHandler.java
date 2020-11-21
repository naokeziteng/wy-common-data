package com.wenyu7980.data.jpa.query;

import com.wenyu7980.query.QueryPredicateExpress;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author wenyu
 */
public interface QueryPageHandler<P> {
    /**
     * 分页查询
     * @param express
     * @param pageable
     * @return
     */
    PageBody<P> getPage(QueryPredicateExpress express, Pageable pageable);
}
