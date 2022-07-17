package ru.russianroadman.wingman.service.crud.find

import ru.russianroadman.wingman.entity.Employee
import java.util.*

interface EmployeeFindService {

    fun findByAccountId(id: UUID): Optional<Employee>

    fun findByLogin(login: String): Optional<Employee>

    /**
     * It is a common situation where none of
     * the employees are associated with issue
     * This may happen due to different source
     * of help attached to the issue or help
     * is not present at all
     */
    fun findByIssueId(id: UUID): Optional<Employee>

    fun findByDepartmentId(id: UUID): Optional<Employee>

    /**
     * It is common when Help entity has
     * no employee attached to it
     * Basically, returned value of this method matches
     * same expectations as method findByIssueId(UUID) does
     */
    fun findByHelpId(id: UUID): Optional<Employee>

    fun findByEmployeeHelp(id: UUID): Employee

}