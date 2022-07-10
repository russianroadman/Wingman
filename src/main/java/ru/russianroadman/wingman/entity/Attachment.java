package ru.russianroadman.wingman.entity;

import javax.persistence.*;

@Entity
public class Attachment extends WingmanEntity {

    @ManyToOne
    @JoinColumn(nullable = false)
    private Message message;

    @Column
    private String fileLink;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
}
