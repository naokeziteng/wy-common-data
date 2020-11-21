package com.wenyu7980.data.jpa.query;

import com.wenyu7980.query.QueryPredicateExpress;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author wenyu
 */
public abstract class AbstractQueryExistsHandler<E> implements QueryExistsHandler {
    @Autowired
    private QueryService<E> queryService;

    @Override
    public long count(QueryPredicateExpress express) {
        return queryService.count(express);
    }
}
