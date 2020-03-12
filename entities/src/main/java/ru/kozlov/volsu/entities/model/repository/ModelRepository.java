package ru.kozlov.volsu.entities.model.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import ru.kozlov.volsu.entities.model.entity.ModelDoc;

import java.util.Optional;

public interface ModelRepository extends MongoRepository<ModelDoc, ObjectId>, ModelQueryRepository<ModelDoc> {
    Optional<ModelDoc> findByFileId(ObjectId fileId);
}
