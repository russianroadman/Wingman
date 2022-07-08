package ru.russianroadman.wingman.entity;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
public abstract class WingmanEntity extends SimpleAuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private Boolean isHidden;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Boolean isHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean hidden) {
        isHidden = hidden;
    }
}
