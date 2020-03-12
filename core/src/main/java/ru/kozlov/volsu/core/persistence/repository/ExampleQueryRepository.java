package ru.kozlov.volsu.core.persistence.repository;

import ru.kozlov.volsu.core.persistence.PersistenceEntity;
import ru.kozlov.volsu.core.persistence.query.ExampleQuery;
import ru.kozlov.volsu.core.persistence.query.ExampleResult;

import java.util.List;
import java.util.Optional;

public interface ExampleQueryRepository<T extends PersistenceEntity> {

    List<T> find(ExampleQuery<T> query);

    Optional<T> findOne(ExampleQuery<T> query);

    ExampleResult<T> findResult(ExampleQuery<T> query);

    Long count(ExampleQuery<T> query);
}
