package ru.russianroadman.wingman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.UUID;

/**
 * Any source of help, that came to resolve specific issue
 */
@Entity
public class Help extends WingmanEntity {

    @OneToOne
    Issue issue;

}
