package ru.russianroadman.wingman.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AccountRepository : JpaRepository<AccountRepository, UUID> {



}