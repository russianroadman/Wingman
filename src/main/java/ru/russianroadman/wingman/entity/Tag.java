package ru.russianroadman.wingman.entity;

import ru.russianroadman.wingman.data.TagType;

import javax.persistence.*;
import java.util.List;

/**
 * Tag or label, that can hint to a topic of an item inside a collection
 */
@Entity
public class Tag extends WingmanEntity {

    @ManyToMany
    private List<Message> messages;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private TagType type;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TagType getType() {
        return type;
    }

    public void setType(TagType type) {
        this.type = type;
    }
}
