package ru.kozlov.volsu.entities.card.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.kozlov.volsu.core.persistence.PersistenceEntity;

@EqualsAndHashCode(callSuper = false)
@Data
@Document
public class CardDoc extends PersistenceEntity<ObjectId> {
    private ObjectId catId;
    private String title;
    private String description;
    private ObjectId picId;
}