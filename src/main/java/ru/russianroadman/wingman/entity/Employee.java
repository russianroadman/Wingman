package ru.russianroadman.wingman.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Service company employee
 */
@Entity
public class Employee extends WingmanEntity {

    @OneToOne
    private Account account;

    @ManyToOne
    private Department department;

    @Column
    private String businessEmail;

    @Column
    private Date employmentDate;

    @Column
    private Date dismissalDate;

    @Override
    public Boolean isHidden() {
        return super.isHidden() || dismissalDate != null;
    }
}
