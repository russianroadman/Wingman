package ru.russianroadman.wingman.service.data.basic.find

import ru.russianroadman.wingman.entity.Attachment
import java.util.UUID
import javax.persistence.EntityGraph

interface AttachmentFindService {

    fun findByMessageId(id: UUID, graph: EntityGraph<*>? = null): List<Attachment>

}