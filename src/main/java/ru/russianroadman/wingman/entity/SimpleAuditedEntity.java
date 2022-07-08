package ru.russianroadman.wingman.entity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class SimpleAuditedEntity {

    @Column
    Date createdAt;

    @Column
    Date updatedAt;

    @Column
    Date deletedAt;

    @Column
    @ManyToOne
    Account createdBy;

    @Column
    @ManyToOne
    Account updatedBy;

    @Column
    @ManyToOne
    Account deletedBy;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Account getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Account createdBy) {
        this.createdBy = createdBy;
    }

    public Account getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Account updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Account getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(Account deletedBy) {
        this.deletedBy = deletedBy;
    }
}
