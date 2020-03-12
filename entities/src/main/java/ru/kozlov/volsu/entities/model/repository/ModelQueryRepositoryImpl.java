package ru.kozlov.volsu.entities.model.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import ru.kozlov.volsu.core.persistence.query.ExampleQuery;
import ru.kozlov.volsu.core.persistence.query.ExampleResult;
import ru.kozlov.volsu.entities.model.entity.ModelDoc;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ModelQueryRepositoryImpl implements ModelQueryRepository<ModelDoc> {

    private final MongoTemplate mongoTemplate;

    @Override
    public List<ModelDoc> find(ExampleQuery<ModelDoc> query) {
        return mongoTemplate.find(query.getQuery(), ModelDoc.class);
    }

    @Override
    public Optional<ModelDoc> findOne(ExampleQuery<ModelDoc> query) {
        return Optional.ofNullable(mongoTemplate.findOne(query.getQuery(), ModelDoc.class));
    }

    @Override
    public ExampleResult<ModelDoc> findResult(ExampleQuery<ModelDoc> query) {
        return ExampleResult.withItemsAndCount(
                find(query),
                count(query)
        );
    }

    @Override
    public Long count(ExampleQuery<ModelDoc> query) {
        return mongoTemplate.count(query.getQuery(), ModelDoc.class);
    }
}