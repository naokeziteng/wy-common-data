package com.wenyu7980.data.jpa.query;

import com.wenyu7980.query.QueryPredicateExpress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author wenyu
 */
public abstract class AbstractQueryHandler<E, L, P>
  implements QueryExistsHandler, QueryListHandler<L>, QueryPageHandler<P>, ConvertList<E, L>, ConvertPage<E, P> {
    @Autowired
    private QueryService<E> queryService;

    @Override
    public long count(QueryPredicateExpress express) {
        return queryService.count(express);
    }

    @Override
    public List<L> getList(QueryPredicateExpress express) {
        return queryService.findList(express).stream().map(this::convertList).collect(Collectors.toList());
    }

    @Override
    public List<L> getList(QueryPredicateExpress express, Sort sort) {
        return queryService.findList(express, sort).stream().map(this::convertList).collect(Collectors.toList());
    }

    @Override
    public PageBody<P> getPage(QueryPredicateExpress express, Pageable pageable) {
        return PageBody.of(queryService.findPage(express, pageable), this::convertPage);
    }
}
