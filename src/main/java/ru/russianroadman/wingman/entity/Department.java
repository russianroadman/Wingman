package ru.russianroadman.wingman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Specific department in entire service
 */
@Entity
public class Department extends WingmanEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
