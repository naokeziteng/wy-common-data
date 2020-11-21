package com.wenyu7980.data.jpa.query;

import com.wenyu7980.query.QueryPredicateExpress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author wenyu
 */
public abstract class AbstractQueryPageHandler<E, P>
  implements QueryExistsHandler, QueryPageHandler<P>, ConvertPage<E, P> {
    @Autowired
    private QueryService<E> queryService;

    @Override
    public long count(QueryPredicateExpress express) {
        return queryService.count(express);
    }

    @Override
    public PageBody<P> getPage(QueryPredicateExpress express, Pageable pageable) {
        return PageBody.of(queryService.findPage(express, pageable), this::convertPage);
    }
}
