package ru.russianroadman.wingman.service.data.basic.delete

import java.util.UUID

interface AccountDeleteService {

    fun delete(login: String)

    fun delete(id: UUID)

    fun deleteByEmployeeId(id: UUID)

    fun deleteByClientId(id: UUID)

}