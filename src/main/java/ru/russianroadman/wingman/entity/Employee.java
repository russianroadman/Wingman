package ru.russianroadman.wingman.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Service company employee
 */
@Entity
public class Employee extends WingmanEntity {

    @OneToOne
    @JoinColumn(nullable = false, unique = true)
    private Account account;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Department department;

    @Column(nullable = false)
    private String businessEmail;

    @Column(nullable = false)
    private Date employmentDate;

    @Column
    private Date dismissalDate;

    @Override
    public Boolean isHidden() {
        return super.isHidden() || isFired();
    }

    public Boolean isFired() {
        return dismissalDate != null;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Date getDismissalDate() {
        return dismissalDate;
    }

    public void setDismissalDate(Date dismissalDate) {
        this.dismissalDate = dismissalDate;
    }
}
