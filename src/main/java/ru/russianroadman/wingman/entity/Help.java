package ru.russianroadman.wingman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * Any source of help, that came to resolve specific issue
 */
@Entity
public class Help extends WingmanEntity {

    @OneToOne
    @JoinColumn(nullable = false, unique = true)
    Issue issue;

    public Date helpProvidedAt(){
        return super.getCreatedAt();
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }
}
