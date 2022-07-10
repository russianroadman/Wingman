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
    private List<Department> department;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }
}
