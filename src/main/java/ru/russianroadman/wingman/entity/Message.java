package ru.russianroadman.wingman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.UUID;

/**
 * Message attached to issue
 */
@Entity
public class Message extends WingmanEntity {

    @ManyToOne
    Issue issue;

    @ManyToOne
    Account sender;

    @ManyToMany
    List<Tag> tags;

}
