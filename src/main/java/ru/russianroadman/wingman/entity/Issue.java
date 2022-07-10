package ru.russianroadman.wingman.entity;

import ru.russianroadman.wingman.data.IssueStatus;

import javax.persistence.*;
import java.util.Date;

/**
 * Issue that comes from user, for the employee to resolve
 */
@Entity
public class Issue extends WingmanEntity {

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private Client client;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private IssueStatus status;

    @Column(nullable = false)
    private String title;

    @Column
    private Date closedAt;

    public Boolean isClosed(){
        return closedAt != null;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public IssueStatus getStatus() {
        return status;
    }

    public void setStatus(IssueStatus status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

}
