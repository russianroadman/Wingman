package ru.russianroadman.wingman.service.data.basic.find;

import ru.russianroadman.wingman.entity.Help
import java.util.*

interface HelpFindService {

    fun findByIssueId(id: UUID): Optional<Help>

}
