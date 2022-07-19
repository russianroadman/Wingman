package ru.russianroadman.wingman.service.data.basic.find

import ru.russianroadman.wingman.entity.Client
import java.util.Optional
import java.util.UUID

interface ClientFindService {

    fun findByAccountId(id: UUID): Optional<Client>

    fun findByLogin(login: String): Optional<Client>

    fun findByIssueId(id: UUID): Optional<Client>

    fun findByIssueCode(code: String): Optional<Client>

    fun findByDepartmentId(id: UUID): Optional<Client>

}