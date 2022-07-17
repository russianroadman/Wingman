package ru.russianroadman.wingman.service.crud.find

import ru.russianroadman.wingman.entity.Attachment
import java.util.UUID
import javax.persistence.EntityGraph

interface AttachmentFindService {

    fun findByMessageId(id: UUID, graph: EntityGraph<*>? = null): List<Attachment>

}