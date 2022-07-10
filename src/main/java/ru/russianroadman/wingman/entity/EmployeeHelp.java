package ru.russianroadman.wingman.entity;

import javax.persistence.*;

@Entity
@Table(indexes = {
    @Index(
        unique = true,
        name = "idx_help_from_employee",
        columnList = "help_id, employee_id"
    )
})
public class EmployeeHelp extends WingmanEntity {

    @OneToOne
    @JoinColumn(nullable = false)
    private Help help;

    @OneToOne
    @JoinColumn(nullable = false)
    private Employee employee;

    public Help getHelp() {
        return help;
    }

    public void setHelp(Help help) {
        this.help = help;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
