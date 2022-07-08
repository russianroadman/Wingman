package ru.russianroadman.wingman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.UUID;

/**
 * User of the service
 */
@Entity
public class User extends WingmanEntity {

    @OneToOne
    private Account account;

    @ManyToOne
    private Department department;

}
