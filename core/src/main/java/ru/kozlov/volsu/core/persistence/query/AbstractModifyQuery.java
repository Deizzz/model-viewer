package ru.kozlov.volsu.core.persistence.query;

import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import ru.kozlov.volsu.core.persistence.PersistenceEntity;

public abstract class AbstractModifyQuery<T extends PersistenceEntity> implements ExampleQuery<T> {
    protected Update update;
    protected FindAndModifyOptions modifyOptions;

    public abstract Update getUpdate();

    public abstract FindAndModifyOptions getModifyOptions();

    @Override
    public Query getQuery() {
        return Query.query(getMatcherCriteria());
    }
}
