package ru.russianroadman.wingman.service.data.basic.update.impl

import org.springframework.stereotype.Service
import ru.russianroadman.wingman.data.UpdateContext
import ru.russianroadman.wingman.entity.Account
import ru.russianroadman.wingman.service.UpdateStrategy
import ru.russianroadman.wingman.service.data.basic.update.AccountUpdateService
import java.util.*

@Service
class AccountUpdateServiceImpl : AccountUpdateService {

    override fun update(updateContext: UpdateContext<Account>, strategy: UpdateStrategy): Account {
        TODO("Not yet implemented")
    }

    override fun update(update: Account, mapTo: Account, strategy: UpdateStrategy): Account {
        TODO("Not yet implemented")
    }

    override fun update(update: UUID, mapTo: Account, strategy: UpdateStrategy): Account {
        TODO("Not yet implemented")
    }
}