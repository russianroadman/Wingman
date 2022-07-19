package ru.russianroadman.wingman.service.data.basic.find

import ru.russianroadman.wingman.entity.Tag
import java.util.UUID

interface TagFindService {

    fun findByMessageId(id: UUID): List<Tag>

}