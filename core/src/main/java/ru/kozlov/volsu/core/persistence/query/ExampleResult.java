package ru.kozlov.volsu.core.persistence.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ExampleResult<T> {
    private List<T> items = new ArrayList<>();
    private Long count = 0L;

    public static <T> ExampleResult<T> withItemsAndCount(List<T> items, Long count) {
        return new ExampleResult<>(items, count);
    }
}
