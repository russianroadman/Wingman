package ru.russianroadman.wingman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Specific department in entire service
 */
@Entity
public class Department extends WingmanEntity {

    @Column
    private String name;

}
