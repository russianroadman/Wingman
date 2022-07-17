package ru.russianroadman.wingman.entity;

import javax.persistence.*;
import java.util.List;

/**
 * User of the service
 */
@Entity
public class Client extends WingmanEntity {

    @OneToOne
    @JoinColumn(nullable = false)
    private Account account;

    @ManyToMany
    private List<Department> departments;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
