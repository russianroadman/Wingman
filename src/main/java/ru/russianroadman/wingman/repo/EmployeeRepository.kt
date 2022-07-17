package ru.russianroadman.wingman.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.russianroadman.wingman.entity.Employee
import java.util.*

@Repository
interface EmployeeRepository : JpaRepository<Employee, UUID> {



}