package ru.russianroadman.wingman.service.data.basic.find

import ru.russianroadman.wingman.entity.Issue
import java.util.UUID

interface IssueFindService {

    fun findByClientId(id: UUID): List<Issue>

    fun findByEmployeeId(id: UUID): List<Issue>

    fun findByCode(string: String): Issue

}