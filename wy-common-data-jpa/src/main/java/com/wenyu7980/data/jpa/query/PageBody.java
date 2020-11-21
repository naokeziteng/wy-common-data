package com.wenyu7980.data.jpa.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 数据分页
 * @author wenyu
 */
@ApiModel(description = "数据分页")
public class PageBody<T> {
    @ApiModelProperty(name = "数据条数", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private long count;
    @ApiModelProperty(name = "数据页数", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private int pages;
    @ApiModelProperty(name = "数据", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
    private List<T> data;

    public static <E, T> PageBody of(Page<E> page, Function<E, T> mapper) {
        return of(page, mapper, null);
    }

    public static <E, T> PageBody of(Page<E> page, Function<E, T> mapper, Function<List<T>, List<T>> handler) {
        if (Objects.nonNull(handler)) {
            return new PageBody<T>(page.getTotalElements(), page.getTotalPages(),
              handler.apply(page.getContent().stream().map(mapper).collect(Collectors.toList())));
        } else {
            return new PageBody<T>(page.getTotalElements(), page.getTotalPages(),
              page.getContent().stream().map(mapper).collect(Collectors.toList()));
        }
    }

    private PageBody(long count, int pages, List<T> data) {
        this.count = count;
        this.pages = pages;
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public int getPages() {
        return pages;
    }

    public List<T> getData() {
        return data;
    }
}
