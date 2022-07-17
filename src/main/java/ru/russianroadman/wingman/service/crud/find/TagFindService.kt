package ru.russianroadman.wingman.service.crud.find

import ru.russianroadman.wingman.entity.Tag
import java.util.UUID

interface TagFindService {

    fun findByMessageId(id: UUID): List<Tag>

}