package ru.russianroadman.wingman.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.russianroadman.wingman.entity.EmployeeHelp
import java.util.*

@Repository
interface EmployeeHelpRepository : JpaRepository<EmployeeHelp, UUID> {



}