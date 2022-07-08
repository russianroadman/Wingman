package ru.russianroadman.wingman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

/**
 * Issue that comes from user, for the employee to resolve
 */
@Entity
public class Issue extends WingmanEntity {

    @ManyToOne
    User troublemaker;

}
