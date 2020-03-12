package ru.kozlov.volsu.core.web.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@ApiModel("Результат")
@Getter
public class SearchApiResponse<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long count;

    private List<T> items;

    public SearchApiResponse() {
        this.items = new ArrayList<>();
    }

    private SearchApiResponse(List<T> items, long count) {
        this.items = items;
        this.count = count;
    }

    private SearchApiResponse(List<T> items) {
        this.items = items;
    }

    public static <T> SearchApiResponse<T> withItems(List<T> items) {
        return new SearchApiResponse<>(items);
    }

    public static <T> SearchApiResponse<T> withItemsAndCount(List<T> items, Long count) {
        return new SearchApiResponse<>(items, count);
    }
}
