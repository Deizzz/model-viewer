package ru.kozlov.volsu.core.persistence.query;


import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import ru.kozlov.volsu.core.persistence.PersistenceEntity;

public interface ExampleQuery<T extends PersistenceEntity> {

    CriteriaDefinition getMatcherCriteria();

    Query getQuery();

    default boolean isEmpty() {
        return false;
    }
}
