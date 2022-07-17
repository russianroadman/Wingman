package ru.russianroadman.wingman.service.crud.find

import ru.russianroadman.wingman.entity.Account
import java.util.*

interface AccountFindService {

    fun findByLogin(login: String): Optional<Account>

    fun findByClientId(id: UUID): Optional<Account>

    fun findByEmployeeId(id: UUID): Optional<Account>

    fun findByDepartmentId(id: UUID): List<Account>

}