package com.wenyu7980.data.jpa.query;

import com.wenyu7980.query.QueryPredicateExpress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 *
 * @author wenyu
 */
public interface QueryService<T> {
    /**
     * 列表查询
     * @param express
     * @return
     */
    List<T> findList(QueryPredicateExpress express);

    /**
     * 列表排序查询
     * @param express
     * @param sort
     * @return
     */
    List<T> findList(QueryPredicateExpress express, Sort sort);

    /**
     * 分页查询
     * @param express
     * @param pageable
     * @return
     */
    Page<T> findPage(QueryPredicateExpress express, Pageable pageable);

    /**
     * 个数查询
     * @param express
     * @return
     */
    long count(QueryPredicateExpress express);
}
