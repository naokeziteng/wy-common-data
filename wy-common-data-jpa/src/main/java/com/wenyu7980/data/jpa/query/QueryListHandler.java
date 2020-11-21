package com.wenyu7980.data.jpa.query;

import com.wenyu7980.query.QueryPredicateExpress;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 *
 * @author wenyu
 */
public interface QueryListHandler<T> {
    /**
     * 查询
     * @param express
     * @return
     */
    List<T> getList(QueryPredicateExpress express);

    /**
     * 查询
     * @param express
     * @param sort
     * @return
     */
    List<T> getList(QueryPredicateExpress express, Sort sort);
}
