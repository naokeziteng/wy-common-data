package com.wenyu7980.data.jpa.query;

import com.wenyu7980.query.QueryPredicateExpress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author wenyu
 */
public abstract class AbstractQueryListHandler<E, T>
  implements QueryExistsHandler, QueryListHandler<T>, ConvertList<E, T> {
    @Autowired
    private QueryService<E> queryService;

    @Override
    public long count(QueryPredicateExpress express) {
        return queryService.count(express);
    }

    @Override
    public List<T> getList(QueryPredicateExpress express) {
        return queryService.findList(express).stream().map(this::convertList).collect(Collectors.toList());
    }

    @Override
    public List<T> getList(QueryPredicateExpress express, Sort sort) {
        return queryService.findList(express, sort).stream().map(this::convertList).collect(Collectors.toList());
    }
}
