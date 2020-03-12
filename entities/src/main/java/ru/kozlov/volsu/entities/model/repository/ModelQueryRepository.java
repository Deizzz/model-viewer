package ru.kozlov.volsu.entities.model.repository;

import ru.kozlov.volsu.core.persistence.repository.ExampleQueryRepository;
import ru.kozlov.volsu.entities.model.entity.ModelDoc;

public interface ModelQueryRepository<T extends ModelDoc> extends ExampleQueryRepository<ModelDoc> {
}
