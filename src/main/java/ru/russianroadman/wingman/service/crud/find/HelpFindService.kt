package ru.russianroadman.wingman.service.crud.find;

import ru.russianroadman.wingman.entity.Help
import java.util.*

interface HelpFindService {

    fun findByIssueId(id: UUID): Optional<Help>

}
