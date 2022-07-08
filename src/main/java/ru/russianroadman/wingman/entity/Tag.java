package ru.russianroadman.wingman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.UUID;

/**
 * Tag or label, that can hint to a topic of an item inside a collection
 */
@Entity
public class Tag extends WingmanEntity {

    @ManyToMany
    private List<Message> messages;

}
