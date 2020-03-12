package ru.kozlov.volsu.core.persistence.query;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Query;
import ru.kozlov.volsu.core.persistence.PersistenceEntity;
import ru.kozlov.volsu.core.web.api.request.SearchApiRequest;

public abstract class AbstractExampleQuery<T extends PersistenceEntity> implements ExampleQuery<T> {
    protected String query = "";
    protected Integer limit = 20;
    protected Integer offset = 0;

    protected Sort sort;
    protected String sortName = "id";
    protected Sort.Direction sortDirection = Sort.Direction.DESC;

    public AbstractExampleQuery() {
        this.sort = new Sort(sortDirection, sortName);
    }

    public AbstractExampleQuery(SearchApiRequest request) {
        this.query = request.getQuery();
        this.limit = request.getLimit();
        this.offset = request.getOffset();
        this.sortName = request.getSortName();
        this.sortDirection = request.getSortDirection();
        this.sort = new Sort(sortDirection, sortName);
    }

    @Override
    public Query getQuery() {
        return Query.query(getMatcherCriteria())
                .with(this.sort)
                .limit(this.limit)
                .skip(this.offset);
    }
}
