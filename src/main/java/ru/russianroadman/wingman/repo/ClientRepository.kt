package ru.russianroadman.wingman.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import ru.russianroadman.wingman.entity.Client
import java.util.*

@Repository
interface ClientRepository : JpaRepository<Client, UUID> {

    @Query(
        nativeQuery = true,
        value = "select account_id from client where id = :clientId"
    )
    fun getAccountId(clientId: UUID): UUID



}