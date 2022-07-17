package ru.russianroadman.wingman.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.russianroadman.wingman.entity.Rights
import java.util.*

@Repository
interface RightsRepository : JpaRepository<Rights, UUID> {



}