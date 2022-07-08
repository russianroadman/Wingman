package ru.russianroadman.wingman.entity;

import ru.russianroadman.wingman.data.VisionType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

/**
 * Account, representing user of the service
 */
@Entity
public class Account extends WingmanEntity {

    @Column
    private String login;

    @Column
    private String passwordHash;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String pat;

    @Column
    private Date birthDate;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String telegram;

    /**
     * Type of objects that this account can see
     */
    @Column
    private VisionType xray;

}
