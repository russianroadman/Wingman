package ru.russianroadman.wingman.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.russianroadman.wingman.entity.Department
import java.util.*

@Repository
interface DepartmentRepository : JpaRepository<Department, UUID> {



}