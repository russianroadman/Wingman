package ru.russianroadman.wingman.entity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/**
 * Message attached to issue
 */
@Entity
public class Message extends WingmanEntity {

    @ManyToOne
    @JoinColumn(nullable = false)
    private Issue issue;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Account sender;

    @ManyToMany(mappedBy = "messages")
    private List<Tag> tags;

    @OneToMany(mappedBy = "message")
    private List<Attachment> attachments;

    @Column
    private String text;

    public Boolean hasText() {
        return text != null && !text.isBlank();
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
