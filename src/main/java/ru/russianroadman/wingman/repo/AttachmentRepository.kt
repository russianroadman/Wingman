package ru.russianroadman.wingman.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.russianroadman.wingman.entity.Attachment
import java.util.*

@Repository
interface AttachmentRepository : JpaRepository<Attachment, UUID> {



}