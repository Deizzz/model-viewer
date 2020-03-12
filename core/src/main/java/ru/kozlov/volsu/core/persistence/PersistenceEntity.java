package ru.kozlov.volsu.core.persistence;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class PersistenceEntity<ID> {
    /**
     * Unique identifier
     */
    @Id
    protected ID id;

    protected Date createdAt;

    protected Date updateAt;

    public PersistenceEntity() {
        this.createdAt = new Date();
        this.updateAt = new Date();
    }
}