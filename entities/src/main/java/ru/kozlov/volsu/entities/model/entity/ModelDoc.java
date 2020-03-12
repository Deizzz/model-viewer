package ru.kozlov.volsu.entities.model.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.kozlov.volsu.core.persistence.PersistenceEntity;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class ModelDoc extends PersistenceEntity<ObjectId> {
    @Indexed
    private ObjectId fileId;
    private ObjectId mtlFileId;
    private ObjectId ddsFileId;
    private ObjectId stlFileId;
    @Indexed
    private ObjectId categoryId;
    private String name;
    private String author;
    @Indexed
    private ObjectId authorUserId;
    private String description;
    private List<ObjectId> likes;

    private ObjectId previewPicId;

    public ModelDoc() {
        likes = new ArrayList<>();
    }
}