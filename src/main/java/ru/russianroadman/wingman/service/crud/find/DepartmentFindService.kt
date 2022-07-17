package ru.russianroadman.wingman.service.crud.find

import ru.russianroadman.wingman.entity.Department
import java.util.UUID

interface DepartmentFindService {

    fun findByClientId(id: UUID): List<Department>

    fun findByEmployeeId(id: UUID): List<Department>

}