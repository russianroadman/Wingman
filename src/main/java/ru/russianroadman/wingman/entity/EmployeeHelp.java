package ru.russianroadman.wingman.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
public class EmployeeHelp extends WingmanEntity {

    @OneToOne
    private Help help;

    @OneToOne
    private Employee employee;

}
